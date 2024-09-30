package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		calcu = new Calculadora();
		
		resultadoSuma = calcu.sumar(5, 3);
		System.out.println("Suma resultado es: "+resultadoSuma);
		
		resultadoResta = calcu.restar(5, 3);
		System.out.println("Resta resultado es: "+resultadoResta);
		
		resultadoMulti = calcu.multiplicar(24.34, 3.15);
		System.out.println("Multiplicacion restulado es: "+ resultadoMulti);
	}

}
