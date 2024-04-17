package edu.ucjc.programacion.poo.herencia.ejercicioAbstracto;

public class Moto extends Vehiculo {
	//Atributos
	private String matricula;
	private int cilindrada;
	//
	public Moto(String marca, String modelo, int fabricacion, String matricula, int cilindrada) {
		super(marca, modelo, fabricacion);
		this.matricula = matricula;
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	//Getter and Setter
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	//toString
	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", cilindrada=" + cilindrada + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getFabricacion()=" + getFabricacion() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	//metodos acelerar y frenar
	public void acelerar() {
		System.out.println("La moto esta acelerando");
	}
	public void frenar() {
		System.out.println("La moto esta frenando");
	}

}
