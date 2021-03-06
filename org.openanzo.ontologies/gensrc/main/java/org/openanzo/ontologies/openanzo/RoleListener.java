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
 * Revision:	$Id: RoleListener.java 5125 2010-02-11 16:33:03Z mroy $
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *	   Cambridge Semantics Incorporated - Fork to Anzo
 *******************************************************************************/
package org.openanzo.ontologies.openanzo;

/**
 * Implementations of this listener may be registered with instances of org.openanzo.ontologies.openanzo.Role to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface RoleListener extends org.openanzo.rdf.jastor.ThingListener {


	/**
	 * Called when a value of member has been added
	 * @param source the affected instance of org.openanzo.ontologies.openanzo.Role
	 * @param newValue the object representing the new value
	 */	
	public void memberAdded(org.openanzo.ontologies.openanzo.Role source, org.openanzo.ontologies.openanzo.User newValue);

	/**
	 * Called when a value of member has been removed
	 * @param source the affected instance of org.openanzo.ontologies.openanzo.Role
	 * @param oldValue the object representing the removed value
	 */
	public void memberRemoved(org.openanzo.ontologies.openanzo.Role source, org.openanzo.ontologies.openanzo.User oldValue);
		
}