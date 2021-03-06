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
 * Revision:	$Id: RoleImpl.java 5125 2010-02-11 16:33:03Z mroy $
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *	   Cambridge Semantics Incorporated - Fork to Anzo
 *******************************************************************************/
package org.openanzo.ontologies.openanzo;

/**
 * Implementation of {@link org.openanzo.ontologies.openanzo.Role}
 * Use the org.openanzo.ontologies.openanzo.AnzoFactory to create instances of this class.
 * <p>(URI: http://openanzo.org/ontologies/2008/07/Anzo#Role)</p>
 * <br>
 */
public class RoleImpl extends org.openanzo.rdf.jastor.ThingImpl implements org.openanzo.ontologies.openanzo.Role {
	private ThingStatementListener _listener = null;

	protected static final org.openanzo.rdf.URI memberProperty = org.openanzo.rdf.jastor.ThingFactory.valueFactory.createURI("http://openanzo.org/ontologies/2008/07/Anzo#member");

	RoleImpl(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException {
		super(resource, namedGraphUri, dataset);
		_listener = new ThingStatementListener();
	}   
	   
    	
	static RoleImpl getRole(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException {
		if(namedGraphUri==null||!dataset.containsNamedGraph(namedGraphUri) ){
			namedGraphUri=null;
			for(org.openanzo.rdf.Statement stmt:dataset.find(resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Role.TYPE)){
				namedGraphUri=stmt.getNamedGraphUri();
			}
			if(namedGraphUri==null)return null;
		}
		return new RoleImpl(resource, namedGraphUri, dataset);
	}
	    
	static RoleImpl createRole(org.openanzo.rdf.Resource resource,org.openanzo.rdf.URI namedGraphUri, org.openanzo.rdf.IDataset dataset) throws org.openanzo.rdf.jastor.JastorException { 
		
		RoleImpl impl = new RoleImpl(resource, namedGraphUri,dataset);
		if (!impl._dataset.contains(impl._resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Role.TYPE, namedGraphUri))
			impl._dataset.add(impl._resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, Role.TYPE, namedGraphUri);
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
		
		list.addAll(_dataset.find(_resource, memberProperty, null, _graph.getNamedGraphUri()));
		
		
		list.addAll(_dataset.find(_resource,  org.openanzo.rdf.vocabulary.RDF.TYPE, org.openanzo.ontologies.openanzo.Role.TYPE, _graph.getNamedGraphUri()));
		return list;
	}

	/**
	 * Clears all values for 'member'. 
	 * @param 		includeEntireDataset Delete the properties from the entire dataset, and not just the namedgraph
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	 @SuppressWarnings("all")
	public void clearMember(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException{
		_dataset.remove(_resource, memberProperty, null,(includeEntireDataset)?null:_graph.getNamedGraphUri());
	}
// generating for property: http://openanzo.org/ontologies/2008/07/Anzo#member

// generating range: http://jastor.adtech.ibm.com/defaultRange

	org.openanzo.rdf.jastor.PropertyCollection<org.openanzo.ontologies.openanzo.User> propertyCollectionMember = new org.openanzo.rdf.jastor.PropertyCollection<org.openanzo.ontologies.openanzo.User>() {
		public org.openanzo.ontologies.openanzo.User getPropertyValue(org.openanzo.rdf.Value resource) {
			try {
				return org.openanzo.ontologies.openanzo.AnzoFactory.getUser((org.openanzo.rdf.Resource)resource,_graph.getNamedGraphUri(),dataset());
			} catch (org.openanzo.rdf.jastor.JastorException e) {
				throw new java.util.NoSuchElementException(e.getMessage());
			}
		}
	};

	/**
	 * 
	 * @param includeEntireDataset
	 * @return collection of org.openanzo.ontologies.openanzo.User 
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	public java.util.Collection<org.openanzo.ontologies.openanzo.User> getMember(boolean includeEntireDataset) throws org.openanzo.rdf.jastor.JastorException {
		return propertyCollectionMember.getPropertyCollection(_dataset, _graph, _resource,memberProperty, org.openanzo.rdf.MemURI.create("http://openanzo.org/ontologies/2008/07/Anzo#User"), includeEntireDataset);
	}
	
	/**
	 * 
	 * @return collection of org.openanzo.ontologies.openanzo.User  not including entire dataset during search
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	public java.util.Collection<org.openanzo.ontologies.openanzo.User> getMember() throws org.openanzo.rdf.jastor.JastorException {
		return getMember(false);
	}

/**
     * 
     * @param member value to add
     * @throws org.openanzo.rdf.jastor.JastorException
     */
	public void addMember(org.openanzo.ontologies.openanzo.User member) throws org.openanzo.rdf.jastor.JastorException {
		_dataset.add(_resource, memberProperty,member.resource(),_graph.getNamedGraphUri());
	}
	
	/**
     * Add anonymous object
     * @return generated object
     * @throws org.openanzo.rdf.jastor.JastorException
     */	
	public org.openanzo.ontologies.openanzo.User addMember() throws org.openanzo.rdf.jastor.JastorException {
		org.openanzo.ontologies.openanzo.User member = org.openanzo.ontologies.openanzo.AnzoFactory.createUser(org.openanzo.rdf.jastor.ThingFactory.valueFactory.createBNode(),_graph.getNamedGraphUri(),_dataset);
		_dataset.add(_resource, memberProperty,member.resource(),_graph.getNamedGraphUri());
		return member;
	}
	
	 /**
     * Add resource 
     * @param resource resource to add
     * @return jastor object for resource
     * @throws org.openanzo.rdf.jastor.JastorException
     */
	public org.openanzo.ontologies.openanzo.User addMember(org.openanzo.rdf.Resource resource) throws org.openanzo.rdf.jastor.JastorException {
		org.openanzo.ontologies.openanzo.User member = org.openanzo.ontologies.openanzo.AnzoFactory.getUser(resource,_graph.getNamedGraphUri(),_dataset);
		_dataset.add(_resource, memberProperty,member.resource(),_graph.getNamedGraphUri());
		return member;
	}
	
	/**
	 * Remove object
	 * @param member object to remove
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	public void removeMember(org.openanzo.ontologies.openanzo.User member) throws org.openanzo.rdf.jastor.JastorException {
		if (!_dataset.contains(_resource, memberProperty, member.resource(),_graph.getNamedGraphUri()))
			return;
		_dataset.remove(_resource, memberProperty, member.resource(),_graph.getNamedGraphUri());
	}

	/**
	 * Remove resource
	 * @param resource resource to remove
	 * @throws org.openanzo.rdf.jastor.JastorException
	 */
	public void removeMember(org.openanzo.rdf.Resource resource) throws org.openanzo.rdf.jastor.JastorException {
		if (!_dataset.contains(_resource, memberProperty, resource,_graph.getNamedGraphUri()))
			return;
		_dataset.remove(_resource, memberProperty, resource,_graph.getNamedGraphUri());
	}
  


	protected java.util.concurrent.CopyOnWriteArraySet<RoleListener> listeners = new  java.util.concurrent.CopyOnWriteArraySet<RoleListener>();
	
	public void registerListener(org.openanzo.rdf.jastor.ThingListener listener) {
		if (!(listener instanceof RoleListener)) {
			throw new org.openanzo.rdf.jastor.JastorException("Listener class not of proper type");
		}
		if(listeners.size()==0){
    		_dataset.registerListener(_listener);
    	}
    	RoleListener list = (RoleListener)listener;
		if(!listeners.contains(list)){
			listeners.add(list);
		}
	}
	
	public void unregisterListener(org.openanzo.rdf.jastor.ThingListener listener) {
		if (!(listener instanceof RoleListener)) {
			throw new org.openanzo.rdf.jastor.JastorException("Listener class not of proper type");
		}
		RoleListener list = (RoleListener)listener;
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
			if (statement.getPredicate().equals(memberProperty)) {
				if (!(statement.getObject() instanceof org.openanzo.rdf.Resource))
					return;
				org.openanzo.rdf.Resource resource = (org.openanzo.rdf.Resource)statement.getObject();
				org.openanzo.ontologies.openanzo.User _member = org.openanzo.ontologies.openanzo.AnzoFactory.getUser(resource,_graph.getNamedGraphUri(),dataset());
				if (_member != null) {
					for(RoleListener listener : listeners){
						listener.memberAdded(org.openanzo.ontologies.openanzo.RoleImpl.this,_member);
					}
				}			
			}
		}}
		}
		
		public void statementsRemoved(org.openanzo.rdf.IDataset dataset, org.openanzo.rdf.Statement...statements) {
		for(org.openanzo.rdf.Statement statement:statements){
			if (statement.getSubject().equals(resource())){
			if (statement.getPredicate().equals(memberProperty)) {
				if (!(statement.getObject() instanceof org.openanzo.rdf.Resource))
					return;
				org.openanzo.rdf.Resource resource = (org.openanzo.rdf.Resource)statement.getObject();
				org.openanzo.ontologies.openanzo.User _member = org.openanzo.ontologies.openanzo.AnzoFactory.getUser(resource,_graph.getNamedGraphUri(),dataset());
				if (_member != null) {
					for(RoleListener listener : listeners){
						listener.memberRemoved(org.openanzo.ontologies.openanzo.RoleImpl.this,_member);
					}
				}
				return;
			}
		}
		}}
	}
	


}