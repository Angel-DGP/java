package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else if (c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		if(c1.getTelefono().getOperadora()==c2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public void ActivarUsuario(Contacto user) {
		if(user.getTelefono().isTieneWazza()==true) {
			user.setActivo(true);
		}else {
			System.out.println("no se hizo nada xd AdminContacto:25");
		}
		
	}
}
