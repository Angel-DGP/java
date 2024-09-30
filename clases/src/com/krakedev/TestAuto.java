package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		auto1 = new Auto();
		Auto auto2;
		auto2 = new Auto();
		
		auto1.marca = "Ford";
		auto1.anio = 2022;
		auto1.precio = 35657.65;
		
		System.out.println("Marca auto1 :" + auto1.marca);
		System.out.println("Anio auto1 :" + auto1.anio);
		System.out.println("Precio auto1 :" + auto1.precio);
	
		System.out.println("-----------------");
		
		auto2.marca = "Chevrolet";
		auto2.anio = 2022;
		auto2.precio = 32997.95;
		
		System.out.println("Marca auto2 :" + auto2.marca);
		System.out.println("Anio auto2 :" + auto2.anio);
		System.out.println("Precio auto2 :" + auto2.precio);
	}

}
