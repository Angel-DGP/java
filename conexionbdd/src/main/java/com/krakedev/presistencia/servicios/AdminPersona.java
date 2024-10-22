package com.krakedev.presistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.utils.ConexionBDD;

public class AdminPersona {
	private static Logger LOGGER = LogManager.getLogger(AdminPersona.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_de_nacimiento)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.execute();
			System.out.println("Registro correctamente");
		} catch (Exception e) {
			LOGGER.error("ERROR AT INSERT", e);
			throw new Exception("error al insertar");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("ERROR IN SQLEXCEPTION", e);
				throw new Exception("ERROR CON LA BASE DE DATOS");

			}
		}

	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update personas set nombre=?,apellido=?,estado_civil_codigo =?,numero_hijos =?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento=?,hora_de_nacimiento=? where cedula=?");
			ps.setString(9, persona.getCedula());
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();
			System.out.println("Registro Actualizado correctamente");
		} catch (Exception e) {
			LOGGER.error("ERROR AT INSERT", e);
			throw new Exception("error al insertar");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("ERROR IN SQLEXCEPTION", e);
				throw new Exception("ERROR CON LA BASE DE DATOS");

			}
		}
	}

	public static void eliminar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from personas where cedula=?");
			ps.setString(1, persona.getCedula());
			ps.executeUpdate();
			System.out.println("Registro Eliminado correctamente");
		} catch (Exception e) {
			LOGGER.error("ERROR AT INSERT", e);
			throw new Exception("error al insertar");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("ERROR IN SQLEXCEPTION", e);
				throw new Exception("ERROR CON LA BASE DE DATOS");

			}
		}
	}
}