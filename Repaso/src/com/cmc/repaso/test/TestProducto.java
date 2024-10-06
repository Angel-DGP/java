package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto p1 = new Producto("Algodon", 1.25);
		double descuento = p1.calcularPrecioPromo(10);
		System.out.println("Precio del producto mas su descuento: "+descuento);
	}
}
