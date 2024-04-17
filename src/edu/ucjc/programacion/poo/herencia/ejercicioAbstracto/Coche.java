package edu.ucjc.programacion.poo.herencia.ejercicioAbstracto;

public class Coche extends Vehiculo {
	// Atributos de la clase hija Coche
	private String matricula;
	private int numeroPuertas;
	private String combustible;
	//Constructores
	public Coche(String marca, String modelo, int fabricacion, String matricula, int numeroPuertas, String combustible) {
		super(marca, modelo, fabricacion);
		this.matricula = matricula;
		this.numeroPuertas = numeroPuertas;
		this.combustible = combustible;
		// TODO Auto-generated constructor stub
	}
	//Getter and Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	//toString
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", numeroPuertas=" + numeroPuertas + ", combustible=" + combustible
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getFabricacion()="
				+ getFabricacion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";}
	//Metodos acelerar y frenar
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	public void frenar() {
		System.out.println("El coche esta frenando");
		
	}
}

