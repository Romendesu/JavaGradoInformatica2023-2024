package edu.ucjc.programacion.EjerciciosClase;

import java.util.Scanner;

public class DeclararNota {
	// Declaracion variable
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir Nota:");
		int nota = scan.nextInt();

		// con if

		if (nota > 0 & nota < 5) {
			System.out.println("La nota es un suspenso");
		} else if (nota > 5 & nota < 7) {
			System.out.println("La nota es un aprobado");
		} else if (nota > 7 & nota < 9) {
			System.out.println("La nota es un notable");
		} else if (nota >= 9 & nota <= 10) {
			System.out.println("La nota es un sobresaliente");
		} else {
			System.out.println("La nota es incorrecta");
		}

		// Con switch

		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("La nota es suspenso");
			break;
		case 5:
		case 6:
			System.out.println("La nota es aprobado");
			break;
		case 7:
		case 8:
			System.out.println("La nota es notable");
			break;
		case 9:
		case 10:
			System.out.println("La nota es un sobresaliente");
			break;
		default:
			System.out.println("La nota no es valida");
		}

	}

}