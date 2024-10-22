package com.krakedev.presistencia.test;

import com.krakedev.presistencia.servicios.AdminCompras;

public class TestEliminarCompra {

	public static void main(String[] args) {
		try {
			AdminCompras.eliminar(11);
		} catch (Exception e) {
			System.out.println("Error en el sistema, no se eliminó la compra: " + e.getMessage());
		}
	}

}
