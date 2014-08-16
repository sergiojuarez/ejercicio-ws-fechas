package com.synergyj.cursos.webservices.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface TimeService {
	
	/**
	 * Obtiene la fecha como formato long
	 * 
	 * @return
	 */
	@WebMethod
	long getDateAsLong();
	
	/**
	 * Obtiene la fecha e formato String (dd/mm/yyyy)
	 * 
	 * @return
	 */
	@WebMethod
	String getDateAsString();
	
	

}
