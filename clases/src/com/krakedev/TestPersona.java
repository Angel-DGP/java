package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;
		Persona p2;
		Persona p3;
		p=new Persona();
		p2= new Persona("Santiago");
		p3= new Persona("Santiago", 14, 1.60);
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:"+ p.getEstatura());
		
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("----------------------------------");
		
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:"+ p.getEstatura());
	
	}

}
