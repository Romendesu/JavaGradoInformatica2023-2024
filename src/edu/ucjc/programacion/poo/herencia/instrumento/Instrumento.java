package edu.ucjc.programacion.poo.herencia.instrumento;

public class Instrumento {
	private String nombre;
	private String tipo;
	private double precio;
	private String marca;
	private boolean afinar; // SI NO SE INDICA EL VALOR DEL BOOLEANO => FALSE
	
	//Constructores
	
	public Instrumento(String nombre, String tipo, double precio, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
		}
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isAfinar() {
		return afinar;
	}
	public void setAfinar(boolean afinar) {
		this.afinar = afinar;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", marca=" + marca + "]";
	}
	void afinar() {
		double numero = Math.random()*10; // GENERAR UN NUMERO ENTRE EL 1 AL 10
		
		//OPERADOR TERNARIO
		this.afinar = numero <=8?true:false;
		System.out.println("El instrumento "+ this.nombre + " afinado: " + this.afinar);
		}
	protected void tocar() {
		if (this.afinar) {
			System.out.println("El instrumento "+this.nombre + " está tocando correctamente");
		}else {
			System.out.println("El instrumento "+this.nombre + " no está afinado");
		}
	}
	
}
