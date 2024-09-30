package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; 
		p=new Persona();
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:"+ p.estatura);
		
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		System.out.println("----------------------------------");
		
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:"+ p.estatura);
	
	}

}
