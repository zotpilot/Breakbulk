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
package org.openanzo.combus.listeners;
import javax.jms.MessageProducer;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.openanzo.combus.endpoint.BaseServiceListener;
import org.openanzo.exceptions.AnzoException;
import org.openanzo.exceptions.ExceptionConstants;
import org.openanzo.rdf.Constants;
import org.openanzo.services.IOperationContext;
import org.openanzo.services.IAuthenticationService;

 /**
 * Reset Service combus listener interface
 * @author Generated Code
 */

public class CombusResetServiceListener extends BaseServiceListener {
	/** Service's Name in {@link String} form */
    public static final String SERVICE_ENDPOINT_NAME = Constants.NAMESPACES.SERVICE_PREFIX + "CombusResetServiceListener";


    /** Stats for object*/
    protected org.openanzo.services.DynamicServiceStats stats=null;

   /** Service interface*/
    protected org.openanzo.datasource.IResetService iResetService=null;
    
    /**Queue Name Prefix*/
    protected String queueNamePrefix=null;

    /**
     * Create a new JMSResetServiceListener
     * @param authenticationService Authentication service used by this listener
     * @param _service Service for which listener is handling requests
     * @param queueNamePrefix Prefix for the queue name on which this listener is listening
     */
    public CombusResetServiceListener(IAuthenticationService authenticationService,org.openanzo.datasource.IResetService _service,String queueNamePrefix) {
        super(SERVICE_ENDPOINT_NAME,authenticationService);
        this.iResetService =_service;
        this.queueNamePrefix=queueNamePrefix;
        stats=new org.openanzo.services.DynamicServiceStats(org.openanzo.datasource.IResetService.RESET);
    }

    /**
     *  Statistics object for this service
     * @return the stats object for this service
     */
    public org.openanzo.services.DynamicServiceStats getStatistics(){
    	return stats;
    }

    public String getQueueName() {
        return "services/"+((queueNamePrefix!=null)?queueNamePrefix:"")+"reset";
    }

   
    public TextMessage handleMessage(IOperationContext context, Destination replyTo, String resultFormat, String operation, TextMessage request, MessageProducer messageProducer) throws JMSException, AnzoException {
        verifyCaller(context);
        TextMessage response = null;
if(org.openanzo.datasource.IResetService.RESET.equals(operation)){
		  	long start=0;
        	if (stats.isEnabled()) {
            	start = System.currentTimeMillis();
       		}
        	try{        	
                org.openanzo.combus.JMSMessageWrapper messageWrapper=new org.openanzo.combus.JMSMessageWrapper(request);
				boolean statementsFormatExists=request.propertyExists(org.openanzo.datasource.IResetService.PARAM_STATEMENTSFormat);
				String statementsFormat=(statementsFormatExists)?request.getStringProperty(org.openanzo.datasource.IResetService.PARAM_STATEMENTSFormat):org.openrdf.rio.RDFFormat.TRIG.getDefaultMIMEType();
				String statements=request.getText();
			
				boolean checksFormatExists=request.propertyExists(org.openanzo.datasource.IResetService.PARAM_CHECKSFormat);
				String checksFormat=(checksFormatExists)?request.getStringProperty(org.openanzo.datasource.IResetService.PARAM_CHECKSFormat):org.openrdf.rio.RDFFormat.TRIG.getDefaultMIMEType();
				boolean checksExists=request.propertyExists(org.openanzo.datasource.IResetService.PARAM_CHECKS);
                java.util.Collection<org.openanzo.rdf.Statement> checks = (checksExists)?org.openanzo.services.serialization.transport.StatementsSerializer.deserialize(messageWrapper,org.openanzo.datasource.IResetService.PARAM_CHECKS, checksFormat):null;
					
				java.io.StringWriter output = new java.io.StringWriter();
		        this.iResetService.reset(context,statements,statementsFormat,checks, output);
		        response = session.createTextMessage();
		        response.setBooleanProperty(org.openanzo.rdf.utils.SerializationConstants.operationFailed, false);
		        String out = output.toString();
		        if (out.length() > 0) {
		            response.setText(output.toString());
		        }
			}finally{
       			if (stats.isEnabled()) {
            	    stats.use("reset",(System.currentTimeMillis() - start));
           	 	}
        	}
		} else {
	    	throw new AnzoException(ExceptionConstants.SERVER.UNKNOWN_OPERATION_ERROR, operation);
	    }
	    return response;
    }
}
