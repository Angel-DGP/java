package com.krakedev.presistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.presistencia.servicios.AdminPersona;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PASSWORD = "awds123*";
	private static Logger LOGGER= LogManager.getLogger(AdminPersona.class); 

	public static Connection conectar() throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException CNF) {			
			LOGGER.error("ERROR EN LA INFRAESTRUCTURA",CNF.getMessage());
			throw new Exception("ERROR EN LA INFRAESTRUCTURA");
		} catch (SQLException e) {
			LOGGER.error("ERROR EN CONEXION",e.getMessage());
			throw new Exception("ERROR CON LA BASE DE DATOS");
		}
		return connection;
	}
}
