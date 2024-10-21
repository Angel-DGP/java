package com.krakedev.estaticos.ejercicios.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicios.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	
	
	public AdminAlarmas() {
		super();
		ArrayList<Alarma> al = new ArrayList<Alarma>();
		this.alarmas = al;
	}

	public void agregarAlarma(Alarma alarma) {
			if(alarma != null) {
				alarmas.add(alarma);
			}else {
				
			}
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	
}
