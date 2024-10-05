package com.krakedev;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		int areaR1;
		int areaR2;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		
		double perimetroR1=r1.calcularPerimetro();
		double perimetroR2=r2.calcularPerimetro();
		
		System.out.println("El area de R1 es: " + areaR1);
		System.out.println("El area de R2 es: " + areaR2);
		
		System.out.println("El perimetro de R1 es: " + perimetroR1);
		System.out.println("El perimetro de R2 es: " + perimetroR2);
	}
}
