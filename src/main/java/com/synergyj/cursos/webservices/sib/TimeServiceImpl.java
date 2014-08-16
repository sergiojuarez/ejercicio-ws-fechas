package com.synergyj.cursos.webservices.sib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.sei.TimeService;

@WebService(endpointInterface="com.synergyj.cursos.webservices.sei.TimeService")
public class TimeServiceImpl implements TimeService {
	
	private static final Logger logger = LoggerFactory.getLogger(TimeServiceImpl.class);
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public long getDateAsLong() {		
		Date fecha = new Date();		
		logger.debug("Obteniendo fecha como Long" + fecha.getTime());
		return fecha.getTime();
	}

	public String getDateAsString() {
		Date fecha = new Date();
		String fechaString = dateFormat.format(fecha);
		logger.debug("Obteniendo fecha como String"+fechaString);
		
		return fechaString;
	}

}
