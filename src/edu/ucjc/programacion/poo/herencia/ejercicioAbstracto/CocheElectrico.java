package edu.ucjc.programacion.poo.herencia.ejercicioAbstracto;

public class CocheElectrico extends Coche {
	//Atributo
	private int velocidadRecarga;
	//Constructor
	public CocheElectrico(String marca, String modelo, int fabricacion, String matricula, int numeroPuertas,
			String combustible, int velocidadRecarga) {
		super(marca, modelo, fabricacion, matricula, numeroPuertas, combustible);
		this.velocidadRecarga = velocidadRecarga;
		// TODO Auto-generated constructor stub
	}
	//Getter and Setter
	public int getVelocidadRecarga() {
		return velocidadRecarga;
	}

	public void setVelocidadRecarga(int velocidadRecarga) {
		this.velocidadRecarga = velocidadRecarga;
	}
	public void recargar() {
		System.out.println("El coche se esta recargando con una velocidad de recarga de" + velocidadRecarga +"m/s");
	}
}
