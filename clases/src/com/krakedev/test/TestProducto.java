package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		productoA= new Producto();
		Producto productoB;
		productoB= new Producto();
		Producto productoC;
		productoC= new Producto();
		
		productoA.setNombre("Alcohol");
		productoA.setDescripcion("alcohol xd");
		productoA.setPrecio(3.5);
		productoA.setStockActual(30);
		
		productoB.setNombre("Algodon");
		productoB.setDescripcion("algodon xd");
		productoB.setPrecio(1.0);
		productoB.setStockActual(60);
		
		productoC.setNombre("Paracetamol");
		productoC.setDescripcion("una pastilla xd");
		productoC.setPrecio(4.0);
		productoC.setStockActual(10);
		
		
		System.out.println("Nombre ProductoA:" + productoA.getNombre());
		System.out.println("Descripcion ProductoA:" + productoA.getDescripcion());
		System.out.println("Precio ProductoA:" + productoA.getPrecio());
		System.out.println("Stock ProductoA:" + productoA.getStockActual());
		
		System.out.println("-----------------------");
		
		System.out.println("Nombre ProductoB:" + productoB.getNombre());
		System.out.println("Descripcion ProductoB:" + productoB.getDescripcion());
		System.out.println("Precio ProductoB:" + productoB.getPrecio());
		System.out.println("Stock ProductoB:" + productoB.getStockActual());
		
		System.out.println("-----------------------");
		
		System.out.println("Nombre ProductoC:" + productoC.getNombre());
		System.out.println("Descripcion ProductoC:" + productoC.getDescripcion());
		System.out.println("Precio ProductoC:" + productoC.getPrecio());
		System.out.println("Stock ProductoC:" + productoC.getStockActual());
	}

}
