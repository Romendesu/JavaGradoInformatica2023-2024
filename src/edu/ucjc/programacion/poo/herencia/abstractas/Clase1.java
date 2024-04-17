package edu.ucjc.programacion.poo.herencia.abstractas;

public abstract class Clase1 {
	private String nombre;

	public Clase1(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Clase1 [nombre=" + nombre + "]";
	}
	//Metodo abstracto -> metodo sin implementacion 
	//Obliga a que la clase sea abstracta
	public abstract void metodo1();
	public abstract void metodo2();
}
