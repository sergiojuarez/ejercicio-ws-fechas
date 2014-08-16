/**
 * 
 */
package com.synergy.cursos.webservices.lab1;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sib.TimeServiceImpl;

/**
 * @author sergiojuarez
 *
 */
public class TimeServicePublisher {
	
	private static final Logger logger = LoggerFactory.getLogger("TimeServicePublisher");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String url = "http://127.0.0.1:9898/timeService?wsdl";
		logger.debug("Publicando el Webservice en "+url);
		
		Endpoint.publish(url, new TimeServiceImpl());

	}

}
