package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante EIterado;
		for (int i = 0; i < estudiantes.size(); i++) {
			EIterado = estudiantes.get(i);
			if (EIterado != null) {
				if (EIterado.getCedula().equals(estudiante.getCedula())) {
					return EIterado;
				}
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante std) {
		Estudiante isThere = buscarEstudiantePorCedula(std);
		if (isThere == null) {
			estudiantes.add(std);  
		} else {
			System.out.println("Ya existe un estudiante matriculado con esa CEDULA bro.");
		}
	}

	public double calcularPromedioCurso() {
		double promedioCurso = 0;
		int totalNotas = 0;
		Estudiante Eiterado;
		for (int i = 0; i < estudiantes.size(); i++) {
			Eiterado = estudiantes.get(i);
			if (Eiterado != null) {
				for (int o = 0; o < Eiterado.getNotas().size(); o++) {  
					promedioCurso += Eiterado.getNotas().get(o).getCalificacion();
					totalNotas++;
				}
			}
		}
		return totalNotas > 0 ? promedioCurso / totalNotas : 0;  
	}

	public void mostrar() {
		System.out.println("Lista Estudiantes:");
		Estudiante e;
		double notasCurso = calcularPromedioCurso();
		for (int i = 0; i < estudiantes.size(); i++) {
			e = estudiantes.get(i);
			e.mostrar();
		}
		System.out.println("Clase Curso [Promedio notas del curso: " + notasCurso + " ]");
	}
}
