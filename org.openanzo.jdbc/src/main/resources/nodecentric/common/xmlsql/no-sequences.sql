<?xml version="1.0" encoding="UTF-8"?>
<!--
#*******************************************************************************
# Copyright (c) 2004, 2007 IBM Corporation and Cambridge Semantics Incorporated.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
#  File:        $Source: /cvsroot/slrp/boca/com.ibm.adtech.boca.common/sql/nodecentric/common/xmlsql/no-sequences.sql,v $
# Created by:  Matthew Roy ( <a href="mailto:mroy@us.ibm.com">mroy@us.ibm.com </a>)
# Created on:  9/30/05
# Revision:	$Id: no-sequences.sql 178 2007-07-31 14:22:33Z mroy $
# 
# Contributors:
#     IBM Corporation - initial API and implementation
#     Cambridge Semantics Incorporated - Fork to Anzo
#*******************************************************************************
-->
<preparedstatements>
    <preparedstatement name="insertCommonValue" inputs="+String value"  results="IDENTITY" templateParams="String nodeTableName">
        INSERT INTO {0} (VALUE) VALUES(?)
    </preparedstatement>
	<!--
		New database structure
		
		Insert a node in to the appropriate table
		tableName - Name of the node table
	-->
	<preparedstatement name="insertNode" inputs="+Long id,+String value"  results="COUNTER" templateParams="String nodeTableName">
		INSERT INTO {0} (ID, VALUE,REF) VALUES(?, ?,0)
	</preparedstatement>
	
	<preparedstatement name="insertLongNode" inputs="+Long id, +Long hash, +String value"  results="COUNTER" templateParams="String nodeTableName">
		INSERT INTO {0} (ID, HASH, VALUE,REF) VALUES(?, ?, ?,0)
	</preparedstatement>
	
	<preparedstatement name="insertNodeWithIdentity" inputs="+String value" templateParams="String nodeTableName" results="IDENTITY">
		INSERT INTO {0} (VALUE,REF) VALUES( ?,0)
	</preparedstatement>
	
	<preparedstatement name="insertLongNodeWithIdentity" inputs=" +Long hash, +String value" templateParams="String nodeTableName" results="IDENTITY">
		INSERT INTO {0} ( HASH, VALUE,REF) VALUES(?, ?,0)
	</preparedstatement>
	
	<!--
		Insert a literal and its associated datatype or language if available
	-->
	<preparedstatement name="insertLiteral" inputs="+Long id, +String value, +Long modifier_id"  results="COUNTER" templateParams="String literalNodeTableName">
		INSERT INTO {0} (ID, VALUE, MODIFIER_ID,REF) VALUES(?, ?, ?,0)
	</preparedstatement>
	
	<preparedstatement name="insertLongLiteral" inputs="+Long id, +Long hash, +String value, +Long modifier_id"  results="COUNTER" templateParams="String longLiteralNodeTableName">
		INSERT INTO {0} (ID, HASH, VALUE, MODIFIER_ID,REF) VALUES(?, ?, ?, ?,0)
	</preparedstatement>
		
	<preparedstatement name="insertLiteralWithIdentity" inputs=" +String value, +Long modifier_id" templateParams="String literalNodeTableName" results="IDENTITY">
		INSERT INTO {0} (VALUE, MODIFIER_ID,REF) VALUES( ?, ?,0)
	</preparedstatement>
	
	<preparedstatement name="insertLongLiteralWithIdentity" inputs=" +Long hash, +String value, +Long modifier_id" templateParams="String longLiteralNodeTableName" results="IDENTITY">
		INSERT INTO {0} ( HASH, VALUE, MODIFIER_ID,REF) VALUES( ?, ?, ?,0)
	</preparedstatement>
	<!--	
		Get an ID from the node sequence
	-->
	<preparedstatement name="selectNodeID" outputs="Long id" templateParams="String sequenceName" results="VALUE">
		SELECT ID FROM {0}
	</preparedstatement>
	
	<preparedstatement name="updateNodeID" templateParams="String sequenceName" inputs="+Long id">
		UPDATE {0} SET ID = ?
	</preparedstatement>
	
</preparedstatements>