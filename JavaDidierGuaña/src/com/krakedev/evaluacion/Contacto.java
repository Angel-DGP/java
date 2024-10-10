package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Contacto(String cedula, String nombre, String apellido) {
		ArrayList<Telefono> tl = new ArrayList<Telefono>();
		this.telefonos = tl;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void imprimir() {
		System.out.println("***" + getNombre() + " " + getApellido() + "***");
		if (getDireccion() != null) {
			System.out.println(
					"Dirección: " + getDireccion().getCallePrincipal() + " y " + getDireccion().getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}

	}

	public void agregarTelefono(Telefono addTelefono) {
		if (addTelefono == null) {
			System.out.println("Ingrese un telefono valido. Error Null");
		} else {
			telefonos.add(addTelefono);
		}
	}
	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C': ");
		Telefono telefonoIterado;
		for(int i = 0; i<telefonos.size();i++) {
			telefonoIterado = telefonos.get(i);
			if(telefonoIterado.getEstado().equals("C")) {
				System.out.println("Número: " + telefonoIterado.getNumero() + ", Tipo: " + telefonoIterado.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos(){
		Telefono telefonoIterado;
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		for(int i = 0; i<telefonos.size();i++) {
			telefonoIterado = telefonos.get(i);
			if(telefonoIterado.getEstado().equals("E")) {
				telefonosIncorrectos.add(telefonoIterado);
			}
		}
		return telefonosIncorrectos;
	}
}
