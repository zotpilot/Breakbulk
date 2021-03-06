/*******************************************************************************
 * Copyright (c) 2007 Cambridge Semantics Incorporated.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * File:        $Source$
 * Created by:  Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com </a>)
 * Created on:  Sep 19, 2007
 * Revision:	$Id$
 *
 * Contributors:
 *     Cambridge Semantics Incorporated - initial API and implementation
 *******************************************************************************/
package org.openanzo.jet.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.taskdefs.MatchingTask;
import org.apache.tools.ant.types.FileSet;
import org.openanzo.jet.exceptions.PropertiesDefinitionParser.PropertyGroup;
import org.openanzo.jet.exceptions.templates.DictionaryDefinitionsTemplate;

/**
 * Ant Task for running property definition generator
 * 
 * @author Matthew Roy ( <a href="mailto:mroy@cambridgesemantics.com">mroy@cambridgesemantics.com </a>)
 * 
 */
public class DictionaryDefinitionTask extends MatchingTask {

    File          destinationFolder;

    File          wikiDestinationFolder;

    List<FileSet> fileSets = new Vector<FileSet>();

    /**
     * Create a new composition task
     */
    public DictionaryDefinitionTask() {
    }

    /**
     * Set the destination file
     * 
     * @param destinationFolder
     *            directory where the property classes is written
     */
    public void setDestdir(File destinationFolder) {
        this.destinationFolder = destinationFolder;
    }

    /**
     * Set the wikiDestinationFolder file
     * 
     * @param destinationFolder
     *            directory where the wiki text is written
     */
    public void setWikiDestdir(File destinationFolder) {
        this.wikiDestinationFolder = destinationFolder;
    }

    /**
     * Add a set of files to parse
     * 
     * @param fileSet
     *            a set of files to parse
     */
    public void addFileset(FileSet fileSet) {
        fileSets.add(fileSet);
    }

    @Override
    public void execute() throws BuildException {
        for (FileSet set : fileSets) {
            DirectoryScanner ds = set.getDirectoryScanner(getProject());
            String files[] = ds.getIncludedFiles();
            String base = ds.getBasedir().getAbsolutePath();
            for (int i = 0; i < files.length; i++) {
                String filename = files[i];
                String file = base + "/" + filename;
                parseFile(file);
            }
        }
    }

    /**
     * Parse a properties file
     * 
     * @param fileName
     *            file to parse
     */
    public void parseFile(String fileName) {
        try {
            PropertiesDefinitionParser parser = new PropertiesDefinitionParser();
            SAXParser fSAXParser = SAXParserFactory.newInstance().newSAXParser();
            fSAXParser.parse(new FileInputStream(fileName), parser);
            DictionaryDefinitionsTemplate template = new DictionaryDefinitionsTemplate();
            for (PropertyGroup group : parser.getGroups()) {
                String output = template.generate(group);
                File destFile = new File(this.destinationFolder, group.getPackageName().replace('.', File.separatorChar) + File.separatorChar + group.getClassName() + "Dictionary.java");
                if (!destFile.exists()) {
                    destFile.getParentFile().mkdirs();
                    destFile.createNewFile();
                }
                Writer fos = new OutputStreamWriter(new FileOutputStream(destFile), "UTF-8");
                fos.write(output);
                fos.close();
                File destFile2 = new File(this.wikiDestinationFolder, group.getClassName() + "_wiki.txt");
                if (!destFile2.exists()) {
                    destFile2.getParentFile().mkdirs();
                    destFile2.createNewFile();
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
