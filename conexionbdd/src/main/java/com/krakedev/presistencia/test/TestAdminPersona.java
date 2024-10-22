package com.krakedev.presistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.presistencia.entidades.EstadoCivil;
import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersona;
import com.krakedev.presistencia.utils.Convertidor;

//System.out.println solo se podra usar en los test

public class TestAdminPersona {
	public static void main(String[] args) throws Exception {
		EstadoCivil ec = new EstadoCivil("U","UNION LIBRE");
		Persona p =new Persona("0012345690","Bertha","Lasso",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2000/12/23");
			Date HoraNac = Convertidor.convertirHora("23:59:59");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(HoraNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(2);
			
			AdminPersona.insertar(p);
		} catch (Exception e) {
			System.out.println("ERROR EN EL SISTEMA: " + e.getMessage());
		}
		
	}
}
