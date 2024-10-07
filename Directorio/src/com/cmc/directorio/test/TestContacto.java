package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto {
	public static void main(String [] args) {
		Telefono telef = new Telefono(10, "Claro", "099999999");
		Contacto c = new Contacto("Santiago","Mosquera",telef,60.3);
		c.imprimirContacto();
	}
}
