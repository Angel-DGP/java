package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Estudiante (String nombre){
		this.nombre = nombre;
	}
	public void calificar(double nota) {
		this.nota = nota;
		if(nota<8) {
			this.resultado = "F";
		}
		else {
			this.resultado = "A";
		}
		System.out.println(resultado);
	}
}
