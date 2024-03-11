package edu.ucjc.programacion.poo.ejercicios.ejercicio2;

import edu.ucjc.programacion.poo.ejercicios.ejercicio1.Alumno;
import edu.ucjc.programacion.utilidades.Utilidades;

public class MenuUniversidad {

	public static void main(String[] args) {
		int opcion = 0;

		MenuUniversidad menu = new MenuUniversidad();
		Alumno [] alumnos = null;
		do {
			String[] opciones = {"1. Crear Universidad","2. Insertar Alumnos","3. Mostra alumnos",
					"4. Buscar Alumno","5. Borrar Alumno", "6. Salir"};
			Utilidades.pintarMenu(opciones);
			opcion = Utilidades.pideDatoEntero("Selecciona una opcion");
			
			switch(opcion) {
				case 1: 
					int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos");
					alumnos = new Alumno[numAlumnos];
					System.out.println("Universidad creada con "+ alumnos.length + " alumnos");
					break;
				case 2:
					if (alumnos==null) {
						System.out.println("Debes crear la universidad en la opción 1");
					}else {//Rellenamos el array con objetos de tipo alumno
						
						for (int i=0 ; i<alumnos.length ; i++) {
							String nombre = Utilidades.pideDatoString("Introduce el nombre del alumno "+(i+1));
							String apellidos = Utilidades.pideDatoString("Introduce el apellido del alumno "+(i+1));
							String dni = Utilidades.pideDatoString("Introduce el dni del alumno "+(i+1));
							int edad = Utilidades.pideDatoEntero("Introduce la edad del alumno "+(i+1));
							
							Alumno alumno = new Alumno(nombre,apellidos,edad,dni);
							alumnos[i] = alumno;
						}
						
					}
					break;
				case 3: 
					if (alumnos==null) {
						System.out.println("Debes crear la universidad en la opción 1");
					}else {
						for (Alumno alumno : alumnos) {
							if(alumno!=null) {
								System.out.println("Nombre "+ alumno.getNombre());
								System.out.println("Apellidos "+ alumno.getApellidos());
								System.out.println("dni "+ alumno.getDni());
								System.out.println("edad "+ alumno.getEdad());
								System.out.println("=======================================");
							}else {
								System.out.println("Sin alumno");
							}
							
						}
						
					}
					
					break;
				case 4: 
					if (alumnos==null) {
						System.out.println("Debes crear la universidad en la opción 1");
					}else {
						
						String dniBusqueda = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");
						
						for (Alumno alumno : alumnos) {
							if(alumno !=null && alumno.getDni().equals(dniBusqueda)    ) {
								System.out.println("Alumno con dni "+dniBusqueda + " encontrado");
								break;
							}
						}
						
					}
					
					
					break;
				case 5:
					if (alumnos==null) {
						System.out.println("Debes crear la universidad en la opción 1");
					}else {
						
						String dniBorrar = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");
						
						int i=0;
						boolean alumnoEncontrado = false;
						for (Alumno alumno : alumnos) {
							if(alumno !=null && alumno.getDni().equals(dniBorrar)    ) {
								System.out.println("El alumno encontrado, se elimina");
								alumnoEncontrado = true;
								alumnos[i] = null;
								break;
							}
							i++;
						}
						
						if (!alumnoEncontrado) {
							System.out.println("El alumno con dni " + dniBorrar + " no está en la Universidad");
							
						}
						
					}
					break;
				case 6: System.out.println("Adios!!");break;
				default: System.out.println("Opcion incorrecta");
			}
			
		}while(opcion!=6);
	}
	
//	private void crearUniversidad () {
//		int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos");
//		System.out.println(num2);
//		alumnos = new Alumno[numAlumnos];
//		
//	}

}