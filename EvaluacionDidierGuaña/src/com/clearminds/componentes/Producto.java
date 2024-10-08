package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public void incrementarPrecio(int porcentajeIncremento) {
		double precioActual = getPrecio() + ((porcentajeIncremento * 0.01)*getPrecio());
		setPrecio(precioActual);
	}
	public void disminuirPrecio(double porcentajeIncremento) {
		double precioActual = getPrecio() - porcentajeIncremento;
		setPrecio(precioActual);
	}
	public Producto( String codigo,String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	
}
