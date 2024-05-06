package edu.ucjc.programacion.poo.listas;

import java.util.HashSet;
import java.util.Set;
// HEREDAN DE ITERABLE
public class Sets {
	public static void main(String[] args) {
		Set<String> colores = new HashSet();
		colores.add("Blanco");
		colores.add("Blanco");
		//NO PERMITE GUARDAR DUPLICADOS.
		for (String color : colores) {
			System.out.println(color);
			
		}
	}

}
