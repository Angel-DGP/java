package com.krakedev.estaticos.ejercicios.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicios.entidades.Alarma;
import com.krakedev.estaticos.ejercicios.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicios.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 1, 34);
		Alarma alarma2 = new Alarma(DiasSemana.JUEVES, 23, 59);
		Alarma alarma3 = new Alarma(DiasSemana.DOMINGO, 15, 12);
		Alarma alarma4 = new Alarma(DiasSemana.MARTES, 12, 55);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 5, 11);
		AdminAlarmas ada = new AdminAlarmas();
		ada.agregarAlarma(alarma1);
		ada.agregarAlarma(alarma2);
		ada.agregarAlarma(alarma3);
		ada.agregarAlarma(alarma4);
		ada.agregarAlarma(alarma5);
		ArrayList<Alarma> alarmasCreadas = new ArrayList<Alarma>();
		alarmasCreadas = ada.getAlarmas();
		System.out.println(alarmasCreadas);
	}	
}
