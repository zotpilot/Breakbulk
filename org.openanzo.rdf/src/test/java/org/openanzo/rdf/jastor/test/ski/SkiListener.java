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
package org.openanzo.rdf.jastor.test.ski;

/**
 * Implementations of this listener may be registered with instances of org.openanzo.rdf.jastor.test.ski.Ski to 
 * receive notification when properties changed, added or removed.
 * <br>
 */
public interface SkiListener extends org.openanzo.rdf.jastor.ThingListener {


	/**
	 * Called when designer has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void designerChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when attribute has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void attributeChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of availableLength has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void availableLengthAdded(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Integer newValue);

	/**
	 * Called when a value of availableLength has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */	
	public void availableLengthRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Integer oldValue);

	/**
	 * Called when coreConstruction has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void coreConstructionChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of coreMaterial has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void coreMaterialAdded(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.String newValue);

	/**
	 * Called when a value of coreMaterial has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */	
	public void coreMaterialRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.String oldValue);

	/**
	 * Called when manufacturer has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void manufacturerChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when model has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void modelChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when partnum has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void partnumChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of relatedPartnum has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void relatedPartnumAdded(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Long newValue);

	/**
	 * Called when a value of relatedPartnum has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */	
	public void relatedPartnumRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Long oldValue);

	/**
	 * Called when website has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void websiteChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of competesWith has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void competesWithAdded(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.test.ski.Ski newValue);

	/**
	 * Called when a value of competesWith has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */
	public void competesWithRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.test.ski.Ski oldValue);
		
	/**
	 * Called when identifier has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void identifierChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when mostSimilarTo has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void mostSimilarToChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of multiIdentifier has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void multiIdentifierAdded(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing newValue);

	/**
	 * Called when a value of multiIdentifier has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */
	public void multiIdentifierRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing oldValue);
		
	/**
	 * Called when a value of previousModel has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void previousModelAdded(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.test.ski.Ski newValue);

	/**
	 * Called when a value of previousModel has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */
	public void previousModelRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.test.ski.Ski oldValue);
		
	/**
	 * Called when sidewall has changed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 */
	public void sidewallChanged(org.openanzo.rdf.jastor.test.ski.Ski source);

	/**
	 * Called when a value of isAlpine has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void isAlpineAdded(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Boolean newValue);

	/**
	 * Called when a value of isAlpine has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */	
	public void isAlpineRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.Boolean oldValue);

	/**
	 * Called when a value of isFreestyle has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void isFreestyleAdded(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing newValue);

	/**
	 * Called when a value of isFreestyle has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */
	public void isFreestyleRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing oldValue);
		
	/**
	 * Called when a value of preferredStance has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void preferredStanceAdded(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.String newValue);

	/**
	 * Called when a value of preferredStance has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */	
	public void preferredStanceRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, java.lang.String oldValue);

	/**
	 * Called when a value of complimentBoard has been added
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param newValue the object representing the new value
	 */	
	public void complimentBoardAdded(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing newValue);

	/**
	 * Called when a value of complimentBoard has been removed
	 * @param source the affected instance of org.openanzo.rdf.jastor.test.ski.Ski
	 * @param oldValue the object representing the removed value
	 */
	public void complimentBoardRemoved(org.openanzo.rdf.jastor.test.ski.Ski source, org.openanzo.rdf.jastor.Thing oldValue);
		
}