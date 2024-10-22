package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion2 {
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
					"insert into compras(id_compra,cedula,fecha_compra,monto)\r\n" + "values (?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "0790123456");
			ps.setBigDecimal(4, new BigDecimal(1200.45));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2023/08/21";
			
			try {
				Date fecha = sdf.parse(fechaStr);
				long fechamilis = fecha.getTime();
				java.sql.Date fechaSql = new java.sql.Date(fechamilis);
				ps.setDate(3, fechaSql);
				ps.executeUpdate();
				System.out.println("INSERT REALIZADO");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			/*ps = connection
					.prepareStatement(
							"insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)\r\n"
							+ "values (?,?,?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "22001");
			ps.setBigDecimal(3, new BigDecimal(1400.45));
			ps.setString(4, "C");
			
			SimpleDateFormat sdfT = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStrT = "2023/08/21 08:30:55";
			
			try {
				Date fecha = sdfT.parse(fechaStrT);
				long fechamilis = fecha.getTime();
				java.sql.Date fechaSql = new java.sql.Date(fechamilis);
				ps.setDate(5, fechaSql);
				Time timeSql = new Time(fechamilis);
				ps.setTime(6, timeSql);
				ps.executeUpdate();
				System.out.println("INSERT REALIZADO");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			*/
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
