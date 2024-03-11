package edu.ucjc.programacion.arrays;

public class arrays {
public static void main(String [] args) {
	
	//definir array
	
	int [] numeros = {1, 2, 3, 4}; //Array longitud 4, no se puede cambiar (longitud)
	int [] numeros2 = new int[6]; // Indicar el tamaño de la array
	//numeros = numeros2; //Asigno la array de numero a numero 1
	
	System.out.println(numeros[2]);
	
	numeros2[2] = 4; // Asignar valor de la array a la posicion 2 (0,1,2,3,4,...,n)
	System.out.println(numeros2[2]);
	System.out.println(numeros2.length); // Longitud de la array para numeros 2 
	System.out.println(numeros.length);
}
}
