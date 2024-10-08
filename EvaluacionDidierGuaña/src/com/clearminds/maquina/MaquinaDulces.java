package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;

	public void agregarCelda(Celda cR) {
		celdas.add(cR);
	}

	public void mostrarConfiguracion() {
		Celda citerada;
		for (int i = 0; i < celdas.size(); i++) {
			citerada = celdas.get(i);
			System.out.println("Celda" + (i + 1) + ": " + citerada.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda cIterada;
		for (int i = 0; i < celdas.size(); i++) {
			cIterada = celdas.get(i);
			if (cIterada.getCodigo() == codigoCelda) {
				return cIterada;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String CodigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(CodigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidadItems);
	}

	public void mostrarProductos() {
		Celda cIterada;
		for (int i = 0; i < celdas.size(); i++) {
			cIterada = celdas.get(i);

			if (cIterada.getProducto() != null) {
				System.out.println("Celda:" + cIterada.getCodigo() + " Stock:" + cIterada.getStock()
						+ " Producto Codigo:" + cIterada.getProducto().getCodigo() + " Producto Nombre:"
						+ cIterada.getProducto().getNombre() + " Precio:" + cIterada.getProducto().getPrecio());
			} else {
				System.out.println(
						"Celda:" + cIterada.getCodigo() + " Stock:" + cIterada.getStock() + " Sin Producto asignado");
			}
		}
		System.out.println("Saldo: " + getSaldo());
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda cIterada;
		for (int i = 0; i < celdas.size(); i++) {
			cIterada = celdas.get(i);
			if (cIterada.getCodigo() == codigoCelda) {
				return cIterada.getProducto();
			}
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto().getPrecio();
		}
		return 0.0;

	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda cIterada;
		for (int i = 0; i < celdas.size(); i++) {
			cIterada = celdas.get(i);
			if (cIterada.getProducto() != null) {
				if (cIterada.getProducto().getCodigo() == codigoProducto) {
					return cIterada;
				}
			}
		}
		return null;

	}

	public void incrementarProductos(String cProducto, int cantidadIncrementar) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(cProducto);
		celdaEncontrada.setStock(cantidadIncrementar + celdaEncontrada.getStock());
	}

	public void vender(String cCelda) {
		Celda celdaRecuperada = buscarCelda(cCelda);
		celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
		setSaldo(getSaldo() + celdaRecuperada.getProducto().getPrecio());
		mostrarProductos();
	}
	public double venderConCambio(String cCelda, double valorIngresado) {
		Celda celdaRecuperada = buscarCelda(cCelda);
		celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
		setSaldo(getSaldo() + celdaRecuperada.getProducto().getPrecio());
		return valorIngresado - celdaRecuperada.getProducto().getPrecio();
	}
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> celdasMenores = new ArrayList<Producto>();
		Celda celdaIterada;
		for(int i = 0; i<celdas.size();i++) {
			celdaIterada = celdas.get(i);
			if(celdaIterada.getProducto().getPrecio()<=limite) {
				celdasMenores.add(celdaIterada.getProducto());
			}
		}
		return celdasMenores;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
