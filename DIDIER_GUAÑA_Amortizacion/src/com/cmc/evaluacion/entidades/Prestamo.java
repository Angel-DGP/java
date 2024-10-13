package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double Monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuota;
	private String cedulaCliente;

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public ArrayList<Cuota> getCuota() {
		return cuota;
	}

	public double getMonto() {
		return Monto;
	}

	public void setMonto(double monto) {
		Monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public Prestamo(double monto, double interes, int plazo) {
		Monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuota = new ArrayList<Cuota>(plazo);
	}
	public void mostrarPrestamo() {
		System.out.println("[monto=" + Monto + ", intereses=" + interes + ", plazo=" + plazo + "]");}
}
