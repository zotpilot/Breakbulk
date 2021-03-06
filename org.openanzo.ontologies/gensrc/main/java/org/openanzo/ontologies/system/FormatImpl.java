/*******************************************************************************
 * Copyright (c) 2004, 2007-2008 IBM Corporation and Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * File:        $Source$
 * Created by:  Generated Source from org.openanzo.jdbc.utils.opgen.jet
 * Created on:  Generated Source from org.openanzo.jdbc.utils.opgen.jet
 * Revision:	$Id$
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *	   Cambridge Semantics Incorporated - Fork to Anzo
 *******************************************************************************/
package org.openanzo.ontologies.system;

/**
 * Implementation of {@link org.openanzo.ontologies.system.Format}
 * Use the org.openanzo.ontologies.system.SystemFactory to create instances of this class.
 * <p>(URI: http://openanzo.org/ontologies/2008/07/System#Format)</p>
 * <br>
 */
public class FormatImpl extends org.openanzo.rdf.jastor.ThingImpl implements org.openanzo.ontologies.system.Format {
	private ThingStatementListener _listener = null;

	protected static final org.openanzo.rdf.URI javaTypeProperty = org.openanzo.rdf.jastor.ThingFactory.valueFactory.createURI("http://openanzo.org/ontologies/2008/07/System#javaType");
	protected static final org.openanzo.rdf.URI locationProperty = org.openanzo.rdf.jastor.ThingFactory.valueFactory.createURI("http://openanzo.org/ontologies/2008/07/System#location");

	FormatImpl(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException {
		super(resource, namedGraphUri, dataset);
		_listener = new ThingStatementListener();
	}   
	   
    	
	static FormatImpl getFormat(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException {
		if(namedGraphUri==null||!dataset.containsNamedGraph(namedGraphUri) ){
			namedGraphUri=null;
			for(org.openanzo.rdf.Statement stmt:dataset.find(resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Format.TYPE)){
				namedGraphUri=stmt.getNamedGraphUri();
			}
			if(namedGraphUri==null)return null;
		}
		return new FormatImpl(resource, namedGraphUri, dataset);
	}
	    
	static FormatImpl createFormat(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException { 
		
		FormatImpl impl = new FormatImpl(resource, namedGraphUri,dataset);
		if (!impl._dataset.contains(impl._resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Format.TYPE, namedGraphUri))
			impl._dataset.add(impl._resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Format.TYPE, namedGraphUri);
		impl.addSuperTypes();
		impl.addHasValueValues();
		return impl;
	}
	
	void addSuperTypes() {
	}
   
	void addHasValueValues() {
	}
   
	public java.util.Collection<org.openanzo.rdf.Statement> listStatements() {
		java.util.Collection<org.openanzo.rdf.Statement> list = new java.util.HashSet<org.openanzo.rdf.Statement>();
		
		list.addAll(_dataset.find(_resource, javaTypeProperty, null, _graph.getNamedGraphUri()));
		
		list.addAll(_dataset.find(_resource, locationProperty, null, _graph.getNamedGraphUri()));
		
		
		list.addAll(_dataset.find(_resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, org.openanzo.ontologies.system.Format.TYPE, _graph.getNamedGraphUri()));
		return list;
	}

	/**
	 * Clears all values for 'javaType'. 
	 * @param 		includeEntireDataset Delete the properties from the entire dataset, and not just the namedgraph
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	 @SuppressWarnings("all")
	public void clearJavaType(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException{
		_dataset.remove(_resource, javaTypeProperty, null,(includeEntireDataset)?null:_graph.getNamedGraphUri());
	}
// generating for property: http://openanzo.org/ontologies/2008/07/System#javaType
	public java.lang.String getJavaType(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException {

		java.util.Collection<org.openanzo.rdf.Statement> __valIter =null;
		__valIter =_dataset.find(includeEntireDataset, _resource, javaTypeProperty, null,_graph.getNamedGraphUri());
		if(__valIter.isEmpty()) return null;
		org.openanzo.rdf.Statement statement = __valIter.iterator().next();
		if (statement == null) return null;		
		if (!(statement.getObject() instanceof org.openanzo.rdf.Literal))
			throw new org.openanzo.rdf.jastor.InvalidNodeException(uri() + ": javaType getProperty() in org.openanzo.ontologies.system.Format model not Literal", statement.getObject());
		org.openanzo.rdf.Literal literal=(org.openanzo.rdf.Literal)statement.getObject();
		Object obj = getLiteralValue(literal, "http://www.w3.org/2001/XMLSchema#string");
		if (!(obj instanceof java.lang.String))
			throw new org.openanzo.rdf.jastor.InvalidLiteralException (this.uri() + ": Literal javaType in Format is not of type java.lang.String", literal);
		return (java.lang.String)obj;
		
	}
	
	public java.lang.String getJavaType() throws org.openanzo.rdf.jastor.JastorException {
		return getJavaType(false);
	}
	
	public void setJavaType(java.lang.String javaType) throws org.openanzo.rdf.jastor.JastorException {
		_dataset.remove(_resource, javaTypeProperty, null,_graph.getNamedGraphUri());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		if (javaType != null) {
	
			org.openanzo.rdf.Literal _literal = getLiteral(javaType,"http://www.w3.org/2001/XMLSchema#string");
			_dataset.add(_resource, javaTypeProperty, _literal,_graph.getNamedGraphUri());
	
		}	
	}

	/**
	 * Clears all values for 'location'. 
	 * @param 		includeEntireDataset Delete the properties from the entire dataset, and not just the namedgraph
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	 @SuppressWarnings("all")
	public void clearLocation(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException{
		_dataset.remove(_resource, locationProperty, null,(includeEntireDataset)?null:_graph.getNamedGraphUri());
	}
// generating for property: http://openanzo.org/ontologies/2008/07/System#location
	public org.openanzo.rdf.URI getLocation(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException {

		java.util.Collection<org.openanzo.rdf.Statement> __valIter =null;
		__valIter =_dataset.find(includeEntireDataset, _resource, locationProperty, null,_graph.getNamedGraphUri());
		if(__valIter.isEmpty()) return null;
		org.openanzo.rdf.Statement statement = __valIter.iterator().next();
		if (statement == null) return null;
		if (!(statement.getObject() instanceof org.openanzo.rdf.URI))
			throw new org.openanzo.rdf.jastor.InvalidNodeException(uri() + ": location getProperty() in org.openanzo.ontologies.system.Format model not URI", statement.getObject());
		return (org.openanzo.rdf.URI)statement.getObject();
		
	}
	
	public org.openanzo.rdf.URI getLocation() throws org.openanzo.rdf.jastor.JastorException {
		return getLocation(false);
	}
	
	public void setLocation(org.openanzo.rdf.URI location) throws org.openanzo.rdf.jastor.JastorException {
		_dataset.remove(_resource, locationProperty, null,_graph.getNamedGraphUri());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		if (location != null) {
	
			_dataset.add(_resource, locationProperty, location,_graph.getNamedGraphUri());
	
		}	
	}
 


	protected java.util.concurrent.CopyOnWriteArraySet<FormatListener> listeners = new  java.util.concurrent.CopyOnWriteArraySet<FormatListener>();
	
	public void registerListener(org.openanzo.rdf.jastor.ThingListener listener) {
		if (!(listener instanceof FormatListener)) {
			throw new org.openanzo.rdf.jastor.JastorException("Listener class not of proper type");
		}
		if(listeners.size()==0){
    		_dataset.registerListener(_listener);
    	}
    	FormatListener list = (FormatListener)listener;
		if(!listeners.contains(list)){
			listeners.add(list);
		}
	}
	
	public void unregisterListener(org.openanzo.rdf.jastor.ThingListener listener) {
		if (!(listener instanceof FormatListener)) {
			throw new org.openanzo.rdf.jastor.JastorException("Listener class not of proper type");
		}
		FormatListener list = (FormatListener)listener;
		if(listeners.contains(list)){
			listeners.remove(list);
		}
		if(listeners.size()==0){	
    		_dataset.unregisterListener(_listener);
    	}
	}
	



	protected class ThingStatementListener implements org.openanzo.rdf.IStatementListener<org.openanzo.rdf.IDataset> {
	
		public void statementsAdded(org.openanzo.rdf.IDataset dataset, org.openanzo.rdf.Statement...statements) {
		for(org.openanzo.rdf.Statement statement:statements){
			if (statement.getSubject().equals(resource())){
			if (statement.getPredicate().equals(javaTypeProperty)) {				
				if (!(statement.getObject() instanceof org.openanzo.rdf.Literal))
					return;		
				for(FormatListener listener : listeners){
					listener.javaTypeChanged(org.openanzo.ontologies.system.FormatImpl.this);
				}			
			}
			if (statement.getPredicate().equals(locationProperty)) {
				for(FormatListener listener : listeners){
					listener.locationChanged(org.openanzo.ontologies.system.FormatImpl.this);
				}			
			}
		}}
		}
		
		public void statementsRemoved(org.openanzo.rdf.IDataset dataset, org.openanzo.rdf.Statement...statements) {
		for(org.openanzo.rdf.Statement statement:statements){
			if (statement.getSubject().equals(resource())){
			if (statement.getPredicate().equals(javaTypeProperty)) {				
				if (!(statement.getObject() instanceof org.openanzo.rdf.Literal))
					return;		
				for(FormatListener listener : listeners) {
					listener.javaTypeChanged(org.openanzo.ontologies.system.FormatImpl.this);
				}
				return;
			}
			if (statement.getPredicate().equals(locationProperty)) {
				for(FormatListener listener : listeners) {
					listener.locationChanged(org.openanzo.ontologies.system.FormatImpl.this);
				}
				return;
			}
		}
		}}
	}
	


}