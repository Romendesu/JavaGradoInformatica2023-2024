package edu.ucjc.programacion.utilidades;

import edu.ucjc.programacion.poo.herencia.instrumento.Instrumento;

public class Clarinete extends Instrumento {

	public Clarinete(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void tocar() {
		System.out.println("Tocando el clarinete");
	}

}
