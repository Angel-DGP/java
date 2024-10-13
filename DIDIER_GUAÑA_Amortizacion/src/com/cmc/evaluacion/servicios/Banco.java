package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Banco() {
		ArrayList<Cliente> c1 = new ArrayList<Cliente>();
		this.clientes = c1;
		ArrayList<Prestamo> p1 = new ArrayList<Prestamo>();
		this.prestamos = p1;
	}

	public Cliente buscarCliente(String cedulaCliente) {
		Cliente clienteIterado;
		Cliente clienteRecuperado = null;
		for (int i = 0; i < clientes.size(); i++) {
			clienteIterado = clientes.get(i);
			if (clienteIterado.getCedula().equals(cedulaCliente)) {
				clienteRecuperado = clienteIterado;
			}
		}
		return clienteRecuperado;
	}
	public void registrarCliente(Cliente cliente) {
		Cliente clienteRecuperado = buscarCliente(cliente.getCedula());
		if(clienteRecuperado!=null) {
			System.out.println("Cliente ya registrado con la cedula=" + clienteRecuperado.getCedula());
		}else {
			clientes.add(cliente);
			System.out.println("Cliente registrado correctamente");
		}
	}
	public void asignarPrestamo(String cedulaCliente , Prestamo prestamo) {
		Cliente clienteExist = buscarCliente(cedulaCliente);
		if(clienteExist !=null) {
			prestamo.setCedulaCliente(cedulaCliente);
			prestamos.add(prestamo);
		}else {
			System.out.println("No es cliente del banco");
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente){
		ArrayList<Prestamo> auxiliar = null;
		Prestamo pIterado;
		for(int i = 0; i<prestamos.size();i++) {
			pIterado = prestamos.get(i);
			if(pIterado.getCedulaCliente().equalsIgnoreCase(cedulaCliente)) {
				auxiliar = new ArrayList<Prestamo>();
				CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
				calculadora.generarTabla(pIterado);
				auxiliar.add(pIterado);
			}
		}
		return auxiliar;
	}
}
