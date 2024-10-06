package com.krakdev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto P1 = new Producto(11,"Algodon");
		P1.setDescripcion("Simplemente un algodon");
		P1.setPeso(3.5);
		
		System.out.println("Datos del producto");
		System.out.println("Codigo identificador: " + P1.getCodigo());
		System.out.println("Nombre del Producto: " + P1.getNombre());
		System.out.println("Descripcion del Producto: " + P1.getDescripcion());
		System.out.println("El peso: " + P1.getPeso());

	}

}
