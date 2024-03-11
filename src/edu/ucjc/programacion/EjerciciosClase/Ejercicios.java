package edu.ucjc.programacion.EjerciciosClase;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Guess the size of the array
		System.out.println("Insert the size of the array: ");
		int sizeArray = scan.nextInt();
		
		int[] numbers = new int[sizeArray];
		
		// Guess array elements
		int contador = 0;
		while (contador != sizeArray) {
			System.out.println("Introduce the number for the element" + " " + contador);
			numbers[contador] = scan.nextInt();
			contador += 1;
		}
		System.out.println("=============================================");
		// Guess if the elements of the array are couple or odd
		for (int i=0;i<sizeArray;i++) {
			if (numbers[i]%2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		int matriz [][] = new int[2][3];
	}
}
