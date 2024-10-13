package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Utilitario;

public class CalculadoraAmortizacion {
	static Utilitario util = new Utilitario();

	public static double calcularCuota(Prestamo prestamo) {
		double Cuota = 0.0;
		double interesMensual = 0.0;
		if (prestamo != null) {
			interesMensual = ((prestamo.getInteres() / 12) * 0.01);
			Cuota = (prestamo.getMonto() * interesMensual / (1 - (Math.pow(1 + interesMensual, -prestamo.getPlazo()))));
		}
		return util.redondear(Cuota);
	}

	public void generarTabla(Prestamo prestamo) {
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			double cuotaCalculada = calcularCuota(prestamo);
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(cuotaCalculada);
			if (i == 0) {
				cuota.setInicio(prestamo.getMonto());
			}else {
				Cuota cuotaAnterior = prestamo.getCuota().get(i - 1);
				cuota.setInicio(cuotaAnterior.getSaldo());
			}
			Cuota cuotaSiguiente;
			if (i < prestamo.getPlazo() - 1) {
				cuotaSiguiente = new Cuota(i + 1);
			} else {
				cuotaSiguiente = null;
			}
			calcularValoresCuota(prestamo.getInteres(), cuota, cuotaSiguiente);
			prestamo.getCuota().add(cuota);
		}
	}

	public void calcularValoresCuota(double InteresPrestamo, Cuota cuota, Cuota cuotaSiguiente) {
		double valorInteres = ((InteresPrestamo / 12) * 0.01) * cuota.getInicio();
		double abonoCapital = (cuota.getCuota() - valorInteres) ;
		double saldo = (cuota.getInicio() - abonoCapital );
		cuota.setInteres(valorInteres);
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldo);
		if (cuotaSiguiente == null) {
			cuota.setCuota(cuota.getCuota() + cuota.getSaldo());
			cuota.setSaldo(0.0);
		} else if(cuotaSiguiente!=null) {
			cuotaSiguiente.setInicio(saldo);
		}
	}
	public void mostrarTabla(Prestamo prestamo) {
		System.out.println("Tabla de Amortización:");
		System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo ");

		int numeroCuota = 1;

		for (int i = 0; i < prestamo.getCuota().size(); i++) {
			Cuota objetoCuota = prestamo.getCuota().get(i);
			System.out.print(numeroCuota + "  |  " + objetoCuota.getCuota() + "  |  " + objetoCuota.getInicio() + "  |  " + objetoCuota.getInteres()+ "  |  " + objetoCuota.getAbonoCapital()
					+ "  |  " + objetoCuota.getSaldo() + "\n");
			numeroCuota++;
		}
	}
}
