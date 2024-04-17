package edu.ucjc.programacion.poo.herencia.instrumento;

public class GuitarraElectrica extends Guitarra {
	//ATRIBUTOS
	private double potencia;
	//CONSTRUCTOR
	public GuitarraElectrica(String nombre, String tipo, double precio, String marca, int numCuerdas, String material) {
		super(nombre, tipo, precio, marca, numCuerdas, material);
	}
	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", getNumCuerdas()=" + getNumCuerdas() + ", getMaterial()="
				+ getMaterial() + ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getTipo()="
				+ getTipo() + ", getPrecio()=" + getPrecio() + ", getMarca()=" + getMarca() + ", isAfinar()="
				+ isAfinar() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public void tocar() {
		super.tocar();
		System.out.println("Es una guitarra electrica");
		
	}
}
