package com.krakedev.estaticos.ejercicios.utils;

public class Util {

	public static String formatearHora(int entero) {
		String valor = "";
		if (entero >= 0 && entero <= 9) {
			valor = "0" + entero;
		} else {
			valor = entero + "";
		}
		return valor;
	}

	public static String formatearDia(int dia) {
		String diaDefinido = "";
		if (dia == 0) {
			diaDefinido = "Lunes";
		} else if (dia == 1) {
			diaDefinido = "Martes";
		} else if (dia == 2) {
			diaDefinido = "Miercoles";
		} else if (dia == 3) {
			diaDefinido = "Jueves";
		} else if (dia == 4) {
			diaDefinido = "Viernes";
		} else if (dia == 5) {
			diaDefinido = "Sabado";
		} else if (dia == 6) {
			diaDefinido = "Domingo";
		}
		return diaDefinido;
	}
}
