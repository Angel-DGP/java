package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	public Celda getCelda1() {
		return Celda1;
	}

	public void setCelda1(Celda celda1) {
		Celda1 = celda1;
	}

	public Celda getCelda2() {
		return Celda2;
	}

	public void setCelda2(Celda celda2) {
		Celda2 = celda2;
	}

	public Celda getCelda3() {
		return Celda3;
	}

	public void setCelda3(Celda celda3) {
		Celda3 = celda3;
	}

	public Celda getCelda4() {
		return Celda4;
	}

	public void setCelda4(Celda celda4) {
		Celda4 = celda4;
	}

	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;

	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		Celda p1 = new Celda("0");
		Celda p2 = new Celda("0");
		Celda p3 = new Celda("0");
		Celda p4 = new Celda("0");
		setCelda1(p1);
		setCelda2(p2);
		setCelda3(p3);
		setCelda4(p4);
		Celda1.setCodigo(c1);
		Celda2.setCodigo(c2);
		Celda3.setCodigo(c3);
		Celda4.setCodigo(c4);

	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + Celda1.getCodigo());
		System.out.println("Celda 2: " + Celda2.getCodigo());
		System.out.println("Celda 3: " + Celda3.getCodigo());
		System.out.println("Celda 4: " + Celda4.getCodigo());
	}

	public Celda buscarCelda(String cC) {
		if (Celda1.getCodigo() == cC) {
			return Celda1;
		} else if (Celda2.getCodigo() == cC) {
			return Celda2;
		} else if (Celda3.getCodigo() == cC) {
			return Celda3;
		} else if (Celda4.getCodigo() == cC) {
			return Celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto p1, String cC, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(cC);
		celdaRecuperada.ingresarProducto(p1, cantidadItems);
	}

	public void mostrarProductos() {
		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println("CELDA:" + Celda1.getCodigo());
		System.out.println("*************************************");
		System.out.println("STOCK:" + Celda1.getStock());
		if (Celda1.getProducto() != null) {
			System.out.println("Nombre Producto:" + Celda1.getProducto().getNombre());
			System.out.println("Precio Producto:" + Celda1.getProducto().getPrecio());
			System.out.println("C�digo Producto:" + Celda1.getProducto().getCodigo());
		} else {
			System.out.println("LA celda no tiene producto!");
		}
		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println("CELDA:" + Celda2.getCodigo());
		System.out.println("*************************************");
		System.out.println("STOCK:" + Celda2.getStock());
		if (Celda2.getProducto() != null) {
			System.out.println("Nombre Producto:" + Celda2.getProducto().getNombre());
			System.out.println("Precio Producto:" + Celda2.getProducto().getPrecio());
			System.out.println("C�digo Producto:" + Celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!");
		}
		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println("CELDA:" + Celda3.getCodigo());
		System.out.println("*************************************");
		System.out.println("STOCK:" + Celda3.getStock());
		if (Celda3.getProducto() != null) {
			System.out.println("Nombre Producto:" + Celda3.getProducto().getNombre());
			System.out.println("Precio Producto:" + Celda3.getProducto().getPrecio());
			System.out.println("C�digo Producto:" + Celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!");
		}

		System.out.println(" ");
		System.out.println("-------------------------------------");
		System.out.println("CELDA:" + Celda4.getCodigo());
		System.out.println("*************************************");
		System.out.println("STOCK:" + Celda4.getStock());
		if (Celda4.getProducto() != null) {
			System.out.println("Nombre Producto:" + Celda4.getProducto().getNombre());
			System.out.println("Precio Producto:" + Celda4.getProducto().getPrecio());
			System.out.println("C�digo Producto:" + Celda4.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!");
		}

		System.out.println(" ");
		System.out.println("SALDO DE MAQUINA: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (Celda1.getCodigo() == codigoCelda) {
			return Celda1.getProducto();
		} else if (Celda2.getCodigo() == codigoCelda) {
			return Celda2.getProducto();
		} else if (Celda3.getCodigo() == codigoCelda) {
			return Celda3.getProducto();
		} else if (Celda4.getCodigo() == codigoCelda) {
			return Celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		if (Celda1.getCodigo() == codigoCelda) {
			return Celda1.getProducto().getPrecio();
		} else if (Celda2.getCodigo() == codigoCelda) {
			return Celda2.getProducto().getPrecio();
		} else if (Celda3.getCodigo() == codigoCelda) {
			return Celda3.getProducto().getPrecio();
		} else if (Celda4.getCodigo() == codigoCelda) {
			return Celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (Celda1.getProducto() != null) {
			if (Celda1.getProducto().getCodigo() == codigoProducto) {
				return Celda1;
			}else {return null;}
		}
		else if (Celda2.getProducto() != null) {
			if (Celda2.getProducto().getCodigo() == codigoProducto) {
				return Celda2;
			}else {return null;}

		} else if (Celda3.getProducto() != null) {
			if (Celda3.getProducto().getCodigo() == codigoProducto) {
				return Celda3;
			}else {return null;}
		} else if (Celda4.getProducto() != null) {
			if (Celda4.getProducto().getCodigo() == codigoProducto) {
				return Celda4;
			}else {return null;}
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigoProducto, int cantidadIncrementar) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() * cantidadIncrementar);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.saldo = this.saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda,double valorIngresadoCliente) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		double cambio =  valorIngresadoCliente - celdaEncontrada.getProducto().getPrecio();
		return cambio;
	}
}
