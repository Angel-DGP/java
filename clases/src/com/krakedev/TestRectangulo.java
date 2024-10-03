package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		int areaR1;
		int areaR2;
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		
		int perimetroR1=r1.calcularPerimetro();
		int perimetroR2=r2.calcularPerimetro();
		
		System.out.println("El area de R1 es: " + areaR1);
		System.out.println("El area de R2 es: " + areaR2);
		
		System.out.println("El perimetro de R1 es: " + perimetroR1);
		System.out.println("El perimetro de R2 es: " + perimetroR2);
	}
}
