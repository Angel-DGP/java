package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("A4"));

        Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.50);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("KE35","Jet",0.25);
		maquina.cargarProducto(producto3, "A3", 5);
		
		Producto producto4=new Producto("D457","DeTodito",0.60);
		maquina.cargarProducto(producto4, "A4", 6);
		
		
		ArrayList<Producto> productosMenores=maquina.buscarMenores(1.10);
		System.out.println("Productos Menores: "+ productosMenores.size());
		
		Producto productoIterado;
		for(int a=0;a<productosMenores.size();a++) {
			productoIterado=productosMenores.get(a);
			System.out.println("Nombre Producto: "+ productoIterado.getNombre()+" Precio: "+productoIterado.getPrecio());
		}
		
	
	}

}