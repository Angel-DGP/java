package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String Nombre;
	private String Descripcion;
	private double Peso;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
	public Producto( int Codigo,String Nombre) {
		this.codigo = Codigo;
		this.Nombre = Nombre;
	}
}
