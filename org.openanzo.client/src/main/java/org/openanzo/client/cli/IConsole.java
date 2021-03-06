/*******************************************************************************
 * Copyright (c) 2009 Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * File:        $Source$
 * Created by:  Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com </a>)
 * Created on:  Mar 9, 2010
 * Revision:	$Id: IConsole.java 5245 2010-03-10 15:14:02Z mroy $
 * 
 * Contributors:
 *     Cambridge Semantics Incorporated - initial API and implementation
 *******************************************************************************/
package org.openanzo.client.cli;

import java.io.IOException;

import org.apache.commons.cli.Options;

/**
 * @author Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com</a>)
 * 
 */
public interface IConsole {
    public void writeOutput(String output);

    public void writeError(String error);

    public void beep();

    public String readLine(String prompt) throws IOException;

    public String readString(String prompt, boolean masked) throws IOException;

    public void printException(Exception e, boolean showTrace);

    public void printHelp(String syntax, String header, Options options, String footer);
}
