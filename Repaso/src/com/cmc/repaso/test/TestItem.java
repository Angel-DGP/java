package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item i1 = new Item();
		i1.setProductosActuales(20);
		
		i1.devolver(4);
		i1.mostrarAtributos();
		i1.vender(3);
		i1.mostrarAtributos();
	}

}
