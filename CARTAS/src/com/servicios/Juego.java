package com.servicios;

import com.entidades.Carta;
import com.entidades.Naipe;

import java.util.ArrayList;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	public Juego(ArrayList<String> idsJugadores) {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();

		cartasJugadores = new ArrayList<>();

		for (int i = 0; i < idsJugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}

	public Juego() {
		naipe = new Naipe();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int jugadorCount = cartasJugadores.size();
		int indexCarta = 0;

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < jugadorCount; j++) {
				if (indexCarta < naipeBarajado.size()) {
					cartasJugadores.get(j).add(naipeBarajado.get(indexCarta));
					indexCarta++;
				}
			}
		}
	}

	public int devolverTotal(int idJ) {
		int t = 0;

		if (idJ >= 0 && idJ < cartasJugadores.size()) {
			ArrayList<Carta> cartasDeJugador = cartasJugadores.get(idJ);

			for (int i = 0; i < cartasDeJugador.size(); i++) {
				t += cartasDeJugador.get(i).getNumero().getValor();
			}
		}

		return t;
	}

	public String determinarGanador() {
		String Ganador = "";
		int numGanador = 0;
		int suma = devolverTotal(numGanador);

		for (int i = 0; i < cartasJugadores.size(); i++) {
			int sumaA = devolverTotal(i);

			if (sumaA >= suma) {
				suma= sumaA;
				numGanador = i + 1;
				Ganador = "Jugador "+ numGanador;
			}
		}

		return Ganador;
	}

}