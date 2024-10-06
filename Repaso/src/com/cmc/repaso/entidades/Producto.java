package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
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
		if(precio>=0) {this.precio = precio;}
		else {this.precio = precio * -1;}
	}
	public Producto(String nombre, double precio) {
		setNombre(nombre);
		setPrecio(precio);
	}
	public double calcularPrecioPromo(double precioDescuento) {
		double Descuento = (precio * (precioDescuento/100)); 
		double precioMasDescuento = precio - Descuento;
		return precioMasDescuento;
	}
}
