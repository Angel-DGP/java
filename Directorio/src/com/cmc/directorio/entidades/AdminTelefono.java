package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "movi") {
			telefono.setTieneWazza(true);
		}
	}

	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contados = 0;
		if(t1.getOperadora()=="movi") {contados = contados + 1;}
		if(t2.getOperadora()=="movi") {contados = contados + 1;}
		if(t3.getOperadora()=="movi") {contados = contados + 1;}
		return contados;
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3,Telefono t4) {
		int contados = 0;
		if(t1.getOperadora()=="claro") {contados = contados + 1;}
		if(t2.getOperadora()=="claro") {contados = contados + 1;}
		if(t3.getOperadora()=="claro") {contados = contados + 1;}
		if(t4.getOperadora()=="claro") {contados = contados + 1;}
		return contados;
	}
}
