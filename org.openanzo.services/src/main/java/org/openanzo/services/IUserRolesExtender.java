/*******************************************************************************
 * Copyright (c) 2009 Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * File:        $Source$
 * Created by:  Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com </a>)
 * Created on:  Feb 10, 2010
 * Revision:	$Id: IUserRolesExtender.java 5125 2010-02-11 16:33:03Z mroy $
 * 
 * Contributors:
 *     Cambridge Semantics Incorporated - initial API and implementation
 *******************************************************************************/
package org.openanzo.services;

import java.util.Set;

import org.openanzo.exceptions.AnzoException;
import org.openanzo.rdf.URI;

/**
 * @author Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com</a>)
 * 
 */
public interface IUserRolesExtender {
    public Set<URI> getRolesForUser(IOperationContext context, URI userURI) throws AnzoException;
}
