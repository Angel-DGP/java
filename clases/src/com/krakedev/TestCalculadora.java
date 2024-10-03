package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDiv;
		double resultadoProm;
		calcu = new Calculadora();
		
		resultadoSuma = calcu.sumar(5, 3);
		System.out.println("Suma resultado es: "+resultadoSuma);
		
		resultadoResta = calcu.restar(5, 3);
		System.out.println("Resta resultado es: "+resultadoResta);
		
		resultadoMulti = calcu.multiplicar(24.34, 3.15);
		System.out.println("Multiplicacion restulado es: "+ resultadoMulti);
		
		resultadoDiv = calcu.dividir(10, 2);
		System.out.println("Division resultado es:" + resultadoDiv);
		
		resultadoProm = calcu.promediar(10, 9.1, 8.2);
		System.out.println("Promedio resultado es: " + resultadoProm);
		
		calcu.mostrarResultado();
	}

}
