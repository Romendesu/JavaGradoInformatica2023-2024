package edu.ucjc.programacion.EjerciciosClase;

public class EjerciciosCasa {
	public static void main(String[] args) {
		// Ejercicio 1: Mostrar todos los numeros pares del 0 al 100.
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		// Ejercicio 2: Mostrar por una parte, numeros impares del 1 al 100 y por otro
		// lado, numeros pares del 100 al 1
		for (int i = 1, j=100; j >= 2; i += 2, j-=2) {
			System.out.println(i + "-" + j);
			
		}
	}

}
