package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {
	public static void main(String[] args) {
//	public static final Logger LOGGER = 	
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"awds123*");
			System.out.println("No exception // Nice Connection");

			ps = connection.prepareStatement(
					"insert into videojuegos(codigo,nombre,descripcion,valoracion,fecha_lanzamiento)\r\n"
							+ "values (?,?,?,?,?)");
			// 11,\"Minecraft\" ,\"Juego de mundo abierto\",10);"
			ps.setInt(1, 11);
			ps.setString(2, "Minecraft");
			ps.setString(3, "Juego de mundo abierto");
			ps.setInt(4, 10);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2020/03/22";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechamilis = fecha.getTime();
				System.out.println(fechamilis);
				java.sql.Date fechaSql = new java.sql.Date(fechamilis);
				System.out.println(fechaSql);
				ps.setDate(5, fechaSql);
				ps.executeUpdate();
				System.out.println("INSERT REALIZADO");
			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
