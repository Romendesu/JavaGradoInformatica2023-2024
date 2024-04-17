package edu.ucjc.programacion.poo.herencia.instrumento;

public class Piano extends Instrumento {
	//Atributos
	private int numOctavas;
	private int numPedales;
	
	public Piano(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
	}

	public Piano(String nombre, String tipo, double precio, String marca, int numOctavas, int numPedales) {
		super(nombre, tipo, precio, marca);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}

	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public int getNumPedales() {
		return numPedales;
	}

	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}

	@Override
	public String toString() {
		return "piano [numOctavas=" + numOctavas + ", numPedales=" + numPedales + "]";
	}
	
	

}
