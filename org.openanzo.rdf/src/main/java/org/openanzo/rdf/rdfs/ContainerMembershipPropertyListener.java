/*******************************************************************************
 * Copyright (c) 2004, 2007 IBM Corporation and Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * File:        $Source$
 * Created by:  Generated Source from org.openanzo.jdbc.utils.opgen.jet
 * Created on:  6/11/2007
 * Revision:	$Id$
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *	   Cambridge Semantics Incorporated - Fork to Anzo
 *******************************************************************************/
package org.openanzo.rdf.rdfs;

/**
 * Implementations of this listener may be registered with instances of org.openanzo.rdf.rdfs.ContainerMembershipProperty to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface ContainerMembershipPropertyListener extends org.openanzo.rdf.jastor.ThingListener {


	/**
	 * Called when a value of comment has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void commentAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, java.lang.String newValue);

	/**
	 * Called when a value of comment has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */	
	public void commentRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, java.lang.String oldValue);

	/**
	 * Called when a value of label has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void labelAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, java.lang.String newValue);

	/**
	 * Called when a value of label has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */	
	public void labelRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, java.lang.String oldValue);

	/**
	 * Called when a value of type has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void typeAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs.Class newValue);

	/**
	 * Called when a value of type has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void typeRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs.Class oldValue);
		
	/**
	 * Called when a value of value has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void valueAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource newValue);

	/**
	 * Called when a value of value has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void valueRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource oldValue);
		
	/**
	 * Called when a value of isDefinedBy has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void isDefinedByAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource newValue);

	/**
	 * Called when a value of isDefinedBy has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void isDefinedByRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource oldValue);
		
	/**
	 * Called when a value of member has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void memberAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource newValue);

	/**
	 * Called when a value of member has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void memberRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource oldValue);
		
	/**
	 * Called when a value of seeAlso has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void seeAlsoAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource newValue);

	/**
	 * Called when a value of seeAlso has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void seeAlsoRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Resource oldValue);
		
	/**
	 * Called when domain has changed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 */
	public void domainChanged(org.openanzo.rdf.rdfs.ContainerMembershipProperty source);

	/**
	 * Called when range has changed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 */
	public void rangeChanged(org.openanzo.rdf.rdfs.ContainerMembershipProperty source);

	/**
	 * Called when a value of subPropertyOf has been added
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param newValue the object representing the new value
	 */	
	public void subPropertyOfAdded(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Property newValue);

	/**
	 * Called when a value of subPropertyOf has been removed
	 * @param source the affected instance of org.openanzo.rdf.rdfs.ContainerMembershipProperty
	 * @param oldValue the object representing the removed value
	 */
	public void subPropertyOfRemoved(org.openanzo.rdf.rdfs.ContainerMembershipProperty source, org.openanzo.rdf.rdfs._Property oldValue);
		
}