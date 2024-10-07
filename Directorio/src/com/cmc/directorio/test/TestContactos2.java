package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
	public static void main(String [] args) {
		Contacto c1 = new Contacto("Armando", "Paredes", new Telefono(101, "claro", "0123456789"),90.6);
		Contacto c2 = new Contacto("Lucia", "Fernandez", new Telefono(606, "claro", "0666666666"),666.6);
		AdminContactos ac = new AdminContactos();
		Contacto cMp = ac.buscarMasPesado(c1, c2);
		cMp.imprimirContacto();
		System.out.println("Poseen la misma operadora?: "+ ac.compararOperadoras(c1, c2));
		
	}
}
