package com.krakedev.estaticos;

public class Utilitarios {
	public static boolean validarRango(int valor) {
		boolean majinBoo = false;
		if (valor >= 0 && valor <= 10) {
			majinBoo = true;
		} else {
			majinBoo = false;
		}
		return majinBoo;
	}

}
