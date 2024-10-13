package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public Naipe() {
		ArrayList<Numero> nP = new ArrayList<Numero>();
		numerosPosibles = nP;
		ArrayList<Carta> cT = new ArrayList<Carta>();
		cartas = cT;
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		Palos palos = new Palos();
		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero npI = numerosPosibles.get(i);
			cartas.add(new Carta(npI, palos.getCorazonNegro()));
			cartas.add(new Carta(npI, palos.getCorazonRojo()));
			cartas.add(new Carta(npI, palos.getDiamante()));
			cartas.add(new Carta(npI, palos.getTrebol()));
		}
		System.out.println("Cartas en el arrayList Cartas: " + cartas.size());
	}

	public ArrayList<Carta> barajar() {
		Carta cIterada;
		ArrayList<Carta> Auxiliar = new ArrayList<Carta>();
			for (int i = 0; i <= 100; i++) {
				int RandomNum = Random.obtenerPosicion();
				cIterada = cartas.get(RandomNum);
				if (cIterada.getEstado().equals("N")) {
					Auxiliar.add(cIterada);
					cartas.get(RandomNum).setEstado("C");
				}
			}
			for(int o = 0; o<Auxiliar.size();o++) {
				cIterada = cartas.get(o);
				if(cIterada.getEstado().equalsIgnoreCase("N")) {
					Auxiliar.add(cIterada);
				}
			}
			if (Auxiliar.size() < cartas.size()) {
				for(int o = 0; o<cartas.size();o++) {
					cIterada = cartas.get(o);
					if(cIterada.getEstado().equals("N")) {
						Auxiliar.add(cIterada);
					}
				}
			}
		return Auxiliar;
	}

}
