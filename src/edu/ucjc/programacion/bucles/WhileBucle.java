package edu.ucjc.programacion.bucles;

public class WhileBucle {
	public static void main(String[] args) {
	//While
		int numero = 10;
		while (numero>7) {
			System.out.println(numero--);
		}
	// Do while, primero va a ejecutar y luego evalua la condición
		do {
			numero++;
			System.out.println(numero);
		} while(numero>20);
}
}