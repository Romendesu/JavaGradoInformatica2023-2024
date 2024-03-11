package edu.ucjc.programacion.EjerciciosClase;

import java.util.Scanner;

public class EjercicioClase {
	public static void main(String[] args) {
		// Creación del menu
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("----Menú----");
			System.out.println("Opcion 1: Matriz 3x3 que muestre numeros del 1 al 9.");
			System.out.println("Opcion 2: Pintar un cuadrado con datos proporcionados por el usuario");
			System.out.println("Opcion 3: Serie Fibonacci");
			System.out.println("Opcion 4: Salir");

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				// Creacion de matriz 3x3
				for (int i = 1; i < 10; i++) {
					System.out.print(i + "\t");
					if (i % 3 == 0) {
						System.out.println("\n");
					}
				}
				break;
			case 2:

				// Creacion del cuadrado

				System.out.println("Ingrese el tamaño del cuadrado: ");
				int seleccion = scan.nextInt();
				for (int i = 0, j = 1; i != seleccion; j += 1) {
					if (j != seleccion) {
						System.out.print("*");
					} else if (j == seleccion) {
						i += 1;
						j = 0;
						System.out.println("*");
					}
				}
				break;
			case 3:
				// Creacion de la serie fibonacci
				System.out.println("Ingrese la cantidad de términos para la serie Fibonacci: ");
				int n = scan.nextInt();
				int a = 0, b = 1;
				System.out.print("Serie Fibonacci de " + n + " términos: ");
				for (int i = 0; i < n; i++) {
					System.out.print(a + " ");
					int sum = a + b;
					a = b;
					b = sum;
				}
				System.out.println();
				break;
			case 4:
				System.out.println("El programa se ha cerrado con éxito. ");
				return;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcion != 0);
		scan.close();
	}
}
