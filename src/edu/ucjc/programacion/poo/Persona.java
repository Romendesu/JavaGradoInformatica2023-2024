package edu.ucjc.programacion.poo;

public class Persona {

	private String nombre;
	private String apellidos;  
	private String dni;
	int edad;
	
	public Persona () {
		// Constructor vacio --> Constructor por defecto
	}
	public Persona(String dni) {
		this.dni = dni;
	}
	//Menos a más restrictivas: public-protected-package-private
	
	
	//Metodo getter y setter
	
	public String getNombre() {
		return nombre;
	
		// Alt+Shift+S --> Generate getters and setters
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void correr() {
		if (edad<18) {
			System.out.println("Corre muy rápido");
		}
		else if (edad>=18 && edad < 40) {
			System.out.println("Corre rápido");
		}
		else {
			System.out.println("Corre muy lento");
		}
	}
}

