package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		boolean majinBoo = false;
		if (contacto != null) {
			Contacto cRecuperado = buscarPorCedula(contacto.getCedula());
			if (cRecuperado == null) {
				contactos.add(contacto);
				majinBoo = true;
				this.fechaModificacion = new Date();
			}
		} else {
			majinBoo = false;
		}
		return majinBoo;
	}

	public Contacto buscarPorCedula(String cedulaContacto) {
		Contacto contactoIterado;
		Contacto contactoRecuperado = null;
		if (cedulaContacto != null) {
			for (int i = 0; i < contactos.size(); i++) {
				contactoIterado = contactos.get(i);
				if (contactoIterado.getCedula().equals(cedulaContacto)) {
					contactoRecuperado = contactoIterado;
				}
			}
		}
		return contactoRecuperado;
	}

	public String consultarUltimaModificacion() {
		String fechaR = null;
		if (fechaModificacion != null) {
			SimpleDateFormat fechaNew = new SimpleDateFormat();
			fechaR = fechaNew.format(fechaModificacion);
		}
		return fechaR;
	}

	public int contarPerdidos() {
		int perdidos = 0;
		Contacto cIterado;
		for (int i = 0; i < contactos.size(); i++) {
			cIterado = contactos.get(i);
			if (cIterado.getDireccion() == null) {
				perdidos = perdidos + 1;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		Contacto cIterado;
		Telefono tItreado;
		for (int i = 0; i < contactos.size(); i++) {
			cIterado = contactos.get(i);
			for (int o = 0; o < cIterado.getTelefonos().size(); o++) {
				tItreado = cIterado.getTelefonos().get(o);
				if (tItreado.getTipo().equals("Convencional") && tItreado.getEstado().equals("C")) {
					fijos = fijos + 1;
				}
			}

		}
		return fijos;
	}

	public void depurar() {
		Contacto cIterado;
		for (int i = 0; i < contactos.size(); i++) {
			cIterado = contactos.get(i);
			if(cIterado.getDireccion()!= null) {
				correctos.add(cIterado);
			}
			else {
				incorrectos.add(cIterado);
			}
		}
		contactos.clear();
	}

	public Directorio() {
		ArrayList<Contacto> c1 = new ArrayList<Contacto>();
		contactos = c1;
		ArrayList<Contacto> c2 = new ArrayList<Contacto>();
		correctos = c2;
		ArrayList<Contacto> c3 = new ArrayList<Contacto>();
		incorrectos = c3;
	}
}
