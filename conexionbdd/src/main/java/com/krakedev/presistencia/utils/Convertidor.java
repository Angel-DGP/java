package com.krakedev.presistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.presistencia.servicios.AdminPersona;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm:ss";
	private static Logger LOGGER= LogManager.getLogger(AdminPersona.class); 
	public static Date convertirFecha(String FechaString) throws Exception {
		Date fechaDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		try {
			fechaDate = sdf.parse(FechaString);
		} catch (ParseException e) {
			LOGGER.error("ERROR EN FORMATO DE FECHA", e.getMessage());
			throw new Exception("LA FECHA  NO TIENE EL FORMATO CORRECTO " + FechaString);
		}
		return fechaDate;
	}
	public static Date convertirHora(String HoraString) throws Exception {
		Date fechaDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		try {
			fechaDate = sdf.parse(HoraString);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("LA HORA NO TIENE EL FORMATO CORRECTO");
		}
		return fechaDate;
	}
}
