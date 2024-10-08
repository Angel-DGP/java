package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<Nota>();

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		boolean existe = false;
		for (Nota nota : notas) {
			if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				existe = true;
				break;
			}
		}
		if (!existe && nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			notas.add(nuevaNota);
		} else {
			System.out.println("Ya existe una nota para esa materia o la calificación no es válida.");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		boolean encontrado = false;
		for (Nota nIterada : notas) {
			if (nIterada.getMateria().getCodigo().equals(codigo)) {
				encontrado = true;
				if (nuevaNota <= 10 && nuevaNota >= 0) {
					nIterada.setCalificacion(nuevaNota);
				} else {
					System.out.println("Calificación no válida.");
				}
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontró una materia con ese código");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		if (notas.isEmpty()) {
			System.out.println("El estudiante no tiene notas registradas.");
			return 0;
		}
		double sumaNotas = 0;
		for (Nota nIterada : notas) {
			sumaNotas += nIterada.getCalificacion();
		}
		return sumaNotas / notas.size();
	}

	public void mostrar() {
		System.out.println("Clase Estudiante[Nombre: " + getNombre() + " ,Apellido: " + getApellido() + " ,Cedula: " + getCedula() + "]");
		for (Nota nIterada : notas) {
			System.out.println("Clase Nota[Materia: " + nIterada.getMateria().getNombre() + ", Calificación: " + nIterada.getCalificacion() + "]");
		}
	}
}
