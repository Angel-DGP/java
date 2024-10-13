package com.entidades;

import java.util.ArrayList;

public class Random {
	ArrayList<Integer> NumerosYaEgresados = new ArrayList<Integer>();

	public static int obtenerPosicion() {
		int randomN = (int) (Math.random() * 51 + 1);
		return randomN;
	}

	public ArrayList<Carta> barajarMe() {
		Naipe naipe = new Naipe();
		ArrayList<Carta> barajaR = new ArrayList<Carta>();
		Carta cartaIterada;
		for (int i = 0; i < naipe.getCartas().size(); i++) {
			int numAleatorio;
			cartaIterada = naipe.getCartas().get(numAleatorio = obtenerPosicion());
			NumerosYaEgresados.add(numAleatorio);
			for (int o = 0; o < NumerosYaEgresados.size(); o++) {
				if (numAleatorio != NumerosYaEgresados.get(o)) {
					barajaR.add(cartaIterada);
				}else {
					numAleatorio = obtenerPosicion();
				}
			}
		}
		return barajaR;
	}
	
}
