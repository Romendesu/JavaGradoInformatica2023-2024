package edu.ucjc.programacion.poo.listas;

import java.util.ArrayList;
import java.util.List;

import edu.ucjc.programacion.poo.coche.Coche;


public class Lista {
	public static void main(String[] args) {
		ArrayList lista1 = new ArrayList();
		lista1.add("Test");
		lista1.add(2);
		Coche coche1 = new Coche("111ABC","",null,null);
		Coche coche2 = new Coche("222BCD","",null,null);
		lista1.add(coche1);
//		for(Object object: lista1) {
//			if(object instanceof Coche) {
//				//CASTING -> OBJECT A CLASE OBJECT
//				Coche c1 = (Coche)object;
//				System.out.println(c1.getMatricula());
//			}else {
//				System.out.println(object);
//			}
//		}
		//GENERICOS
		
		List<Coche> coches = new ArrayList(); //Lista donde UNICAMENTE guardo objetos tipo coche	
		coches.add(coche1);
		coches.add(coche2);
		for (Coche coche : coches) {
			System.out.println(coche.getMatricula());
			
		}
		
		coches.get(0);
	}
	
	
	
	
	
}
