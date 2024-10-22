package com.krakedev.presistencia.test;

import java.util.ArrayList;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersona;

public class TestConsultaPersonas {
public static void main(String[] args) {
	ArrayList<Persona> find = new ArrayList<Persona>();
	Persona findOne = new Persona();
	try {
		find = AdminPersona.buscarPorNombre("Juan");
		System.out.println(find);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	try {
		findOne = AdminPersona.buscarPorCedula("0012345689");
		System.out.println(findOne);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
