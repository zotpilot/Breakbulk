/*******************************************************************************
 * Copyright (c) 2008 Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * File:        $Source$
 * Created by:  Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com </a>)
 * Created on:  Oct 11, 2008
 * Revision:	$Id$
 * 
 * Contributors:
 *     Cambridge Semantics Incorporated - initial API and implementation
 *******************************************************************************/
package org.openanzo.test.js;

/**
 * Test the logging js
 */
public class LoggingJS extends AbstractAnzoJsDohRegression {
    /**
     * Test the anzo-js logging
     * 
     * @throws Exception
     */
    public void testLogging() throws Exception {
        String testUrl = "openanzo-js/anzo/tests/log/runTests.html";
        runTest(testUrl);
    }

}
