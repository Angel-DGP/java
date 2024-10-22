package com.krakedev.presistencia.test;

import java.util.ArrayList;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersona;

public class TestBuscarPorApellido {
	public static void main(String[] args) {
		ArrayList<Persona> find = new ArrayList<Persona>();
		try {
			find = AdminPersona.buscarPorApellido("Lasso");
			System.out.println(find);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
