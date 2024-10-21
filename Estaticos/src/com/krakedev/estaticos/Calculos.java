package com.krakedev.estaticos;

public class Calculos {
	private final double iva = 12;
	
	public double calcularIva(double monto) {
		return monto*iva/100;
	}
}
