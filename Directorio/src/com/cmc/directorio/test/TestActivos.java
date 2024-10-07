package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String [] args) {
		Contacto c1 = new Contacto("Queti","Importa",new Telefono(23, "claro", "0123654789"),67.5);
		c1.imprimirContacto();
		System.out.println("Tiene whatsapp=: "+c1.getTelefono().isTieneWazza());
		AdminContactos ad = new AdminContactos();
		ad.ActivarUsuario(c1);
	}
}
