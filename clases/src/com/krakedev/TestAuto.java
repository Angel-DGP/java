package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		auto1 = new Auto("Ford",2022,35657.65);
		Auto auto2;
		auto2 = new Auto("Chevrolet",2022,32997.95);

		
		System.out.println("Marca auto1 :" + auto1.getMarca());
		System.out.println("Anio auto1 :" + auto1.getAnio());
		System.out.println("Precio auto1 :" + auto1.getPrecio());
	
		System.out.println("-----------------");

		
		System.out.println("Marca auto2 :" + auto2.getMarca());
		System.out.println("Anio auto2 :" + auto2.getAnio());
		System.out.println("Precio auto2 :" + auto2.getPrecio());
	}

}
