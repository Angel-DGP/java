package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {
	public static void main(String[] args) {
	Producto mc;
	AdminProducto admin = new AdminProducto();
	Producto p1 = new Producto("Doritos", 0.50);
	Producto p2 = new Producto("Papitas", 0.50);
	mc = admin.buscarMasCaro(p1,p2);
	if(mc==null) {
		System.out.println("Son iguales");
	}else {
		System.out.println("El mas caro es: " + mc.getNombre());
	}
	
	}
}
