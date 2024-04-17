package edu.ucjc.programacion.poo.herencia.instrumento;

public class Guitarra extends Instrumento{
	//ATRIBUTOS
	private int numCuerdas;
	private String material;
	//CONSTRUCTOR
	public Guitarra(String nombre, String tipo, double precio, String marca, int numCuerdas, String material) {
		super(nombre, tipo, precio, marca);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}
	//GETTER AND SETTER
	public int getNumCuerdas() {
		return numCuerdas;
	}
	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	//toSTRING
	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + ", getNombre()=" + getNombre()
				+ ", getTipo()=" + getTipo() + ", getPrecio()=" + getPrecio() + ", getMarca()=" + getMarca() + "]";
	}
	
	//SOOBRESCIBIR EL METODO "TOCAR"
	
	public void tocar() {
		System.out.println("¿Esta tocando la guitarra "+ (this.isAfinar()?"bien":"mal"));
	}
	
	

}
