package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		auto1 = new Auto();
		Auto auto2;
		auto2 = new Auto();
		
		auto1.setMarca("Ford");
		auto1.setAnio(2022);
		auto1.setPrecio(35657.65);
		
		System.out.println("Marca auto1 :" + auto1.getMarca());
		System.out.println("Anio auto1 :" + auto1.getAnio());
		System.out.println("Precio auto1 :" + auto1.getPrecio());
	
		System.out.println("-----------------");
		
		auto2.setMarca("Chevrolet");
		auto2.setAnio(2022);
		auto2.setPrecio(32997.95);
		
		System.out.println("Marca auto2 :" + auto2.getMarca());
		System.out.println("Anio auto2 :" + auto2.getAnio());
		System.out.println("Precio auto2 :" + auto2.getPrecio());
	}

}
