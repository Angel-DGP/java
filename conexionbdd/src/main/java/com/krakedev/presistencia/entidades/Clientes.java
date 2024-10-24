package com.krakedev.presistencia.entidades;

public class Clientes {
	private String cedula;
	private String nombre;
	private String apellido;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Clientes() {

	}

	public Clientes(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Clientes [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
