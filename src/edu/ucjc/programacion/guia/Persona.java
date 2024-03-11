package edu.ucjc.programacion.guia;

public class Persona {
	// Atributos:
	private String nombre;
	private int edad;
	// Constructor:
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	// Metodo:
	public void saludar() {
		System.out.println("Hola soy " + nombre + " y tengo " + edad + "años");
	}
}
