package edu.ucjc.programacion.poo.herencia;

public class ClasePadre {
	//Atributos
	private String atributo1;
	private int contador;
	//Constructor
	public ClasePadre(String atributo1, int contador) {
		super();
		this.atributo1 = atributo1;
		this.contador = contador;
	}
	
	//Getter and Setter
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public void metodo1() {
		System.out.println("Este es el metodo 1");
	}
}
