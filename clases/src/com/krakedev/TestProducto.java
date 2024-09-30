package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		productoA= new Producto();
		Producto productoB;
		productoB= new Producto();
		Producto productoC;
		productoC= new Producto();
		
		productoA.nombre = "Alcohol";
		productoA.descripcion = "alcohol xd";
		productoA.precio = 3.5;
		productoA.stockActual = 30;
		
		productoB.nombre = "Algodon";
		productoB.descripcion = "algodon xd";
		productoB.precio = 1.0;
		productoB.stockActual = 60;
		
		productoC.nombre = "Paracetamol";
		productoC.descripcion = "una pastilla xd";
		productoC.precio = 4.0;
		productoC.stockActual = 10;
		
		
		System.out.println("Nombre ProductoA:" + productoA.nombre);
		System.out.println("Descripcion ProductoA:" + productoA.descripcion);
		System.out.println("Precio ProductoA:" + productoA.precio);
		System.out.println("Stock ProductoA:" + productoA.stockActual);
		
		System.out.println("-----------------------");
		
		System.out.println("Nombre ProductoB:" + productoB.nombre);
		System.out.println("Descripcion ProductoB:" + productoB.descripcion);
		System.out.println("Precio ProductoB:" + productoB.precio);
		System.out.println("Stock ProductoB:" + productoB.stockActual);
		
		System.out.println("-----------------------");
		
		System.out.println("Nombre ProductoC:" + productoC.nombre);
		System.out.println("Descripcion ProductoC:" + productoC.descripcion);
		System.out.println("Precio ProductoC:" + productoC.precio);
		System.out.println("Stock ProductoC:" + productoC.stockActual);
	}

}
