package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado C1 = new Cuadrado();
		C1.lado = 4;
		
		Cuadrado C2 = new Cuadrado();
		C2.lado = 3;
		
		Cuadrado C3 = new Cuadrado();
		C3.lado = 2;
		
		double areaC1 = C1.calcularArea();
		double perimetroC1 = C1.calcularPerimetro();
		System.out.println("El area de C1 es: " + areaC1);
		System.out.println("El perimetro de C1 es: " + perimetroC1);

		double areaC2 = C2.calcularArea();
		double perimetroC2 = C2.calcularPerimetro();
		System.out.println("El area de C2 es: " + areaC2);
		System.out.println("El perimetro de C2 es: " + perimetroC2);
		
		double areaC3 = C3.calcularArea();
		double perimetroC3 = C3.calcularPerimetro();
		System.out.println("El area de C3 es: " + areaC3);
		System.out.println("El perimetro de C3 es: " + perimetroC3);
	}

}
