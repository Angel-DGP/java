package com.krakedev.presistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class URLConexion {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "awds123*";

	private static final Logger LOGGER = LogManager.getLogger(URLConexion.class);

	public static Connection conectar(String URL) throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			LOGGER.debug("Conexión existosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura", e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revise usuario y clave", e);
			throw new Exception("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}
}
