package com.cmc.evaluacion.entidades;

public class Utilitario {
	public double redondear(double valoraRedondear) {
		double redondeado = Math.round(valoraRedondear * 100.0) / 100.0;
		return redondeado;
	}
}
