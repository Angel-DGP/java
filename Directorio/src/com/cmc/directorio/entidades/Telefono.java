package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWazza = false;

	public Telefono(int codigo, String operadora, String numero) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWazza() {
		return tieneWazza;
	}

	public void setTieneWazza(boolean tieneWazza) {
		this.tieneWazza = tieneWazza;
	}
	
	public void imprimir() {
		System.out.println("Datos de telefono " + getCodigo());
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Numero: " + getNumero());
		System.out.println("Operadora: " + getOperadora());
		if(isTieneWazza()==true) {
			System.out.println("Posee whatsapp?: "+isTieneWazza());
		}
	}
}
