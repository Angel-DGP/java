package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int ProductosActuales;
	private int ProductosDevueltos;
	private int ProductosVendidos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return ProductosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		ProductosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return ProductosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		ProductosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return ProductosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		ProductosVendidos = productosVendidos;
	}

	public void mostrarAtributos() {
		System.out.println("___________________________");
		System.out.println("Cantidad Actual del Producto: "+ getProductosActuales());
		System.out.println("Cantidad devuelta del Producto: "+ getProductosDevueltos());
		System.out.println("Cantidad vendida del Producto: "+ getProductosVendidos());
		System.out.println("___________________________");
		System.out.println(" ");
	}
	public void vender(int cantidadPvendidos) {
		int disminuir =  getProductosActuales() - cantidadPvendidos;
		setProductosActuales(disminuir);
		int aumentar = getProductosVendidos() + cantidadPvendidos;
		setProductosVendidos(aumentar);
	}
	
	public void devolver(int cantidadPdevueltos) {
		int aumentar = getProductosActuales() + cantidadPdevueltos;
		int  disminuir = getProductosVendidos() - cantidadPdevueltos;
		setProductosActuales(aumentar);
		setProductosVendidos(disminuir);
		
	}
	
	
}
