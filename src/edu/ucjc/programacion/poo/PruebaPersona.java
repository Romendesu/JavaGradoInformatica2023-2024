package edu.ucjc.programacion.poo;

public class PruebaPersona {
	public static void main(String [] args) {
		// Creamos objeto tipo persona
		Persona persona1 = new Persona(); // --> Acudimos al constructor vacio
		Persona persona2 = new Persona("111A"); // --> Acudimos al constructor con DNI
		
		persona1.setNombre("Juan");
		persona1.setApellidos("Perez");
		persona1.setDni("2222B");
		
		System.out.println(persona1.getNombre()); // --> Muestra Juan por pantalla
		System.out.println(persona2.getNombre()); // --> Muestra Null por pantalla, no hay nada añadido
		
		Persona persona3 = persona2;
		persona2.edad = 21;
		System.out.println(persona3.edad);
		
	}
	}