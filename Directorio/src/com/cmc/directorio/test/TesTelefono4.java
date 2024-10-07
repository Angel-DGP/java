package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TesTelefono4 {

	public static void main(String[] args) {
		Telefono telf = new Telefono(10, "movi", "098234234");
		Telefono telf2 = new Telefono(20, "movi", "098234234");
		Telefono telf3 = new Telefono(30, "claro", "098234234");
		Telefono telf4 = new Telefono(40, "claro", "098234234");

		AdminTelefono at = new AdminTelefono();
		int tfsClaro = at.contarClaro(telf, telf2, telf3, telf4);
		System.out.println(tfsClaro);
	}

}
