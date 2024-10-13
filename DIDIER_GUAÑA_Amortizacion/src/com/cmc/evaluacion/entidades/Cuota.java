package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	Utilitario util = new Utilitario();
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = util.redondear(cuota);
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = util.redondear(capital);
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = util.redondear(inicio);
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = util.redondear(interes);
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = util.redondear(abonoCapital);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = util.redondear(saldo);
	}
	public Cuota(int numero) {
		this.numero = numero;
	}
	public void mostrarPrestamo() {
		System.out.println(" " + this.numero + " | " + getCuota() + " | " + getCapital() + " | " + getInteres() + " | " + getAbonoCapital() + " | "  + getSaldo());
	}
	
}
