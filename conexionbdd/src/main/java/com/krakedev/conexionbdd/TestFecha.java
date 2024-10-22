package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2020/03/22 10:05:04";
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechamilis = fecha.getTime();
			System.out.println(fechamilis);
			java.sql.Date fechaSql = new java.sql.Date(fechamilis);
			System.out.println(fechaSql);

			Time timeSQL = new Time(fechamilis);
			System.out.println(timeSQL);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
