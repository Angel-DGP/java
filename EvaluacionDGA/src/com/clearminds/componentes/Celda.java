package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		setCodigo(codigo);
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void ingresarProducto(Producto p1, int stockInicial) {
		setProducto(p1);
		setStock(stockInicial);
	}
}
