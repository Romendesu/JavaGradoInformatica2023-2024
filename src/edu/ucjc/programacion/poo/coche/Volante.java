package edu.ucjc.programacion.poo.coche;

public class Volante {
	// Definimos variables
	private long id;
	private String tipo;
	private String color;
	// Constructor
	public Volante(long id, String tipo, String color) {
		this.id = id;
		this.tipo = tipo;
		this.color = color;
	}
	// getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
