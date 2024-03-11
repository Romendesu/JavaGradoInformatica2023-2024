package edu.ucjc.programacion.bucles;

public class PruebaStrings {
public static void main(String [] args) {
	// Los strings son inmutables
	String nombre = "Texto";
	
	//String nombre = nombre.toUpperCase();
	
	System.out.println(nombre); // Muestra lo mismo por que los str son INMUTABLES
	//System.out.println(nombre2); //Muestra el nombre en mayusculas
	
	String nombre2 = new String("Texto");
	String nombre3 = "Texto";
	System.out.println(nombre==nombre2);
	System.out.println(nombre==nombre3);
	System.out.println(nombre.equals(nombre2));
	System.out.println(nombre.contains("Te")); //Devuelve si la variable tiene x texto en su interior
	System.out.println(nombre.equalsIgnoreCase(nombre3));
	System.out.println(nombre.indexOf("4")); //Devuelve primera posicion 
	System.out.println(nombre.lastIndexOf("4")); //Devuelve ultima posicion
	
	String cadena = "Esto es unae prueba";
	System.out.println(cadena);
	System.out.println(cadena.trim());
	System.out.println(cadena.replace(" ", " "));
	System.out.println(cadena.substring(3));
	System.out.println(cadena.substring(5, 10));
	System.out.println(cadena + "Prueba");
	System.out.println(cadena.concat("Prueba"));
	String info = "dato1;dato2;dato3";
	String [] datos = info.split(";");
	System.out.println(datos[0]);
	
}
}
