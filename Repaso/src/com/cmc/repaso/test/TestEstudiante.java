package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Santiago");
		e1.calificar(8.1);
		e1.calificar(5.1);
		e1.calificar(10);

	}

}
