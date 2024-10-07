package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String [] args) {
		Telefono telf = new Telefono(11, "movi", "098234234");
		Telefono telf2 = new Telefono(22, "claro", "098234234");
		Telefono telf3 = new Telefono(33, "movi", "098234234");
		AdminTelefono at = new AdminTelefono();
		int tfsMovi = at.contarMovi(telf, telf2, telf3);
		System.out.println(tfsMovi);
	}
}
