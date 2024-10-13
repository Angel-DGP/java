package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCalculadora {
	public static void main(String[] args) {
		Prestamo prestamo = new Prestamo(5000, 12, 12);
		CalculadoraAmortizacion calculadoraAmortizacion = new CalculadoraAmortizacion();
		calculadoraAmortizacion.generarTabla(prestamo);
		calculadoraAmortizacion.mostrarTabla(prestamo);
	}
}	
