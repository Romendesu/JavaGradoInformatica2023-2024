package edu.ucjc.programacion.poo.herencia.ejercicioAbstracto;

public abstract class Vehiculo {
	//Atributos
	private String marca;
	private String modelo;
	private int fabricacion;
	//Constructor
	public Vehiculo(String marca, String modelo, int fabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fabricacion = fabricacion;
	}
	//Getter and Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	//toString
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", fabricacion=" + fabricacion + "]";
	}
	public abstract void acelerar();
	public abstract void frenar();
}

