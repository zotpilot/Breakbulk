/*******************************************************************************
 * Copyright (c) 2007-2008 Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Created by:  Rouben Meschian (<a href="mailto:rmeschian@cambridgesemantics.com">rmeschian@cambridgesemantics.com</a>)
 * Created on:  Oct 10, 2007
 * 
 * Contributors:
 *     Cambridge Semantics Incorporated - initial API and implementation
 *******************************************************************************/

/*
 * @author Rouben Meschian (<a href="mailto:rmeschian@cambridgesemantics.com">rmeschian@cambridgesemantics.com</a>) 
 */
 
dojo.provide("anzo.rdf.NamedGraph");

dojo.require("anzo.rdf.QuadStore");
dojo.require("anzo.rdf.INamedGraph");
dojo.require('anzo.rdf.Statement');

dojo.require('anzo.utils.JSUtil');
dojo.require("anzo.utils.UriGenerator");

dojo.declare('anzo.rdf.NamedGraph', anzo.rdf.INamedGraph, {
    
    // summary: 
    //      An implementation of the anzo.rdf.INamedGraph that stores all of 
    //      its statements in an anzo.rdf.IQuadStore. The anzo.rdf.IQuadStore 
    //      it uses can be specified in the constructor. If not specified, the 
    //      anzo.rdf.NamedGraph creates and uses an anzo.rdf.QuadStore to store 
    //      its statements. The anzo.rdf.NamedGraph can be seen as a view into 
    //      the anzo.rdf.QuadStore that only shows the statements associated with 
    //      its name (namedGraphUri).
    
    // _store : anzo.rdf.IQuadStore
    //  The store this graph uses to store its statements.
    _store : null,
    
    // fireEvents : Boolean
    //  True enables add/remove events, false disables them.
    fireEvents : true,
    
    constructor : function(namedGraphUri, store) {
        
        // summary:
        //      Initializes the graph name and store.
        
        // namedGraphUri : String | anzo.rdf.URI | null
        //  The uri used to ideitify this graph.  If null, a unique URI is generated by default.
        
        // store : anzo.rdf.IQuadStore | null
        //  The store this graph uses to store its statements.  If null, this graph creates and uses an in memory anzo.rdf.QuadStore.
        
        this.namedGraphUri  = namedGraphUri ? anzo.rdf.getValue(namedGraphUri, {type: 'uri'}) : anzo.utils.UriGenerator.generateUri('http://openanzo.org/namedGraphs/');
        this._store          = store ? store : new anzo.rdf.QuadStore();
    },
    
    add : function() {
        
        // summary: Adds the given triple(s) to this graph.
	    //      Form 1: add(statement)   - takes a single statement and adds it
	    //      Form 2: add(statements)  - takes an array of statements and adds them
	    //      Form 3: add(string | anzo.rdf.Resource, string | anzo.rdf.URI, Object, string | anzo.rdf.URI) - adds the given triple    
        //      Form 4: add(anzo.rdf.INamedGraph)  - adds all statements of the given graph to this graph
        
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
        if(arguments[0] instanceof anzo.rdf.Statement) {
            this._addStatements([arguments[0]]);
        } else if(dojo.isArray(arguments[0])) {
            this._addStatements(arguments[0]);
        } else if(arguments[0] instanceof anzo.rdf.INamedGraph) {
            this._addStatements(arguments[0].find());
        } else if(arguments[0] != null && arguments[1] != null && arguments[2] != null) {
            var stmt = anzo.createStatement(arguments[0], arguments[1], arguments[2]);
            this._addStatements([stmt]);
        } else {
            throw Error("Invalid arguments: "+arguments);
        }

    },
    
    _addStatements : function(statements) {
        // summary: Adds the given array of statements to this graph.
        
        // statement : anzo.rdf.Statement[]
        //  Array of triples (statements with subject, predicate and object) that are added to this graph.
	   
	    if(statements == null || !dojo.isArray(statements) || statements.length == 0)
			return;
		var _stmts = [];
		for(var i = 0; i < statements.length; i++) {
		    if(statements[i].namedGraphUri == this.namedGraphUri) 
                _stmts[i] = statements[i];
            else
                _stmts[i] = anzo.createStatement(statements[i].subject, statements[i].predicate, statements[i].object, this.namedGraphUri);
		}              
        this._store.add(_stmts);
        if (this.fireEvents) {
       		this.statementsAdded(_stmts);
        }
    },
    
    remove : function() {
	    
	    // summary: Deletes the given triple(s) from this graph.
		//      Form 1: remove(statement) - removes the given statement
		//      Form 2: remove(statements) - removes the given array of statements
		//      Form 3: remove(string | anzo.rdf.Resource, string | anzo.rdf.URI, Object) - removes the given triple pattern
		//      Form 4: remove(anzo.rdf.INamedGraph) - removes all statements of the given graph from this graph
		
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
        if(arguments[0] instanceof anzo.rdf.Statement) {
            this._removeStatements([arguments[0]]);
        } else if(dojo.isArray(arguments[0])) {
            this._removeStatements(arguments[0]);
        } else if(arguments[0] instanceof anzo.rdf.INamedGraph) {
            this._removeStatements(arguments[0].find());
        } else {
        	if (arguments[0] != null && arguments[1] != null && arguments[2] != null) {
        		var stmts = [anzo.createStatement(arguments[0], arguments[1], arguments[2], this.namedGraphUri)];
        	} else {
            	var stmts = this.find(arguments[0], arguments[1], arguments[2]);
        	}
            this._removeStatements(stmts);
        }
        
    },
    
    _removeStatements : function(statements) {
        // summary: Removes the given array of statements from this graph.
        
        // statement : anzo.rdf.Statement[]
        //  Array of triples (statements with subject, predicate and object) that are removed from this graph.
	   
	    if(statements == null || !dojo.isArray(statements) || statements.length == 0)
			return;
        var _stmts = [];
		for(var i = 0; i < statements.length; i++) {
		    if(statements[i].namedGraphUri == this.namedGraphUri) 
                _stmts[i] = statements[i];
            else
                _stmts[i] = anzo.createStatement(statements[i].subject, statements[i].predicate, statements[i].object, this.namedGraphUri);
		}
        this._store.remove(_stmts);
        if (this.fireEvents) {
        	this.statementsRemoved(_stmts);
        }
    },
    
    getStatements : function() {
    	// summary: Return all the statementsin the graph
		
	    // returns: An array of statements.
    	
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
    	return this.find(null, null, null);
    },
    
    find : function(subject, predicate, object) {
        
        // summary: Find set of statements that match provided parameters.
		
	    // returns: An array of matching statements.
	    
		// subject : String | anzo.rdf.Resource | null
	    //  Subject value to match, or wildcard if null
	    
	    // predicate : String | anzo.rdf.URI | null
	    //   Predicate value to match, or wildcard if null
	    
	    // object : Object | anzo.rdf.Value | null
	    //  Object value to match, or wildcard if null
	    
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
	    return this._store.find(subject, predicate, object, this.namedGraphUri);
    },
    
    contains : function(subject, predicate, object) {
	   // summary: Tests if a statement (pattern) is contained in the graph that match provided parameters.
	    
	    // returns: True if the given pattern is found in this graph, false otherwise.
	    
    	// subject : String | anzo.rdf.Resource | anzo.rdf.Statement | null
	    //  Subject value to match, or wildcard if null
	    
	    // predicate : String | anzo.rdf.URI | null
	    //   Predicate value to match, or wildcard if null
	    
	    // object : Object | anzo.rdf.Value | null
	    //  Object value to match, or wildcard if null
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
	    
	    if(arguments[0] instanceof anzo.rdf.Statement)
            return this.contains(arguments[0].subject, arguments[0].predicate, arguments[0].object);
	    
	    return this._store.contains(subject, predicate, object, this.namedGraphUri);
    },
    
    size : function() {
	    // summary: Return number of statements in graph.
	    // returns: Number of statements in graph.
	    if (this._closed) {
            throw new Error("Graph is closed.");
        }
	    
		return this._store.size(this.namedGraphUri);
	},
	
	isEmpty : function() {
	    // summary: Return if graph is empty.
	    // returns: Returns true if the number of statements in this graph is zero, false otherwise.
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
	    return this._store.isEmpty(this.namedGraphUri);
	},
	
	isClosed : function() {
	    // summary: Return if graph is closed.
	    // returns: True if the graph is closed, false otherwise.
		return this._closed;
	},
    
    close : function() {
        // summary: Close the graph by releasing all resources.
        if (this._closed) {
            return;
        }
        this._store = null;
		this._closed = true;
	},
	
	clear : function() {
	    // summary: Removes all statements from this graph.
        if (this._closed) {
            throw new Error("Graph is closed.");
        }
	    this.remove();
	}

});