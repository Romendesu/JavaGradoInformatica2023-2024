package edu.ucjc.programacion.poo.coche;

public class Piston {
	// Declaramos  variables
	private long id;
	private String marca;
	// Constructor
	public Piston(long id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}
	// Getter and Setter 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
