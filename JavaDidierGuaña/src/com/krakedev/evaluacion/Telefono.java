package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if (numero != null && tipo != null) {
			this.estado = "C";
			if (this.tipo.equalsIgnoreCase("Movil")) {
				if (this.numero.length() == 10) {
				} else {
					this.estado = "E";
				}
			} else if (this.tipo.equalsIgnoreCase("Convencional")) {
				if (this.numero.length() == 7) {
				} else {
					this.estado = "E";
				}
			}else {
				this.estado = "E";
			}
		} else {
			this.estado = "E";
		}
	}

}
