package com.krakedev.controlflujo;

public class Validador {
	public void validarEdad(int edad) {
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}
	}
}
