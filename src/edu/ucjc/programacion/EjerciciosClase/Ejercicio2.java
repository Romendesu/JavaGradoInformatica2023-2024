package edu.ucjc.programacion.EjerciciosClase;


public class Ejercicio2 {
	public static void main(String[] args) {
		String [] emails = {"email1@e mail.es","email1email.es",".email1@emailes"};
		//Iniciamos proceso de comprobacion de los emails
		for (String email:emails) {
			boolean isValido = true;
			String mensaje = "";
			email = email.trim(); //Comprobacion espacios en blanco, trim quita espacios
			if (email.contains(" ")) {
				isValido = false;
				mensaje += "El email no puede tener espacios en blanco";
			}
			if(!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
				isValido = false;
				mensaje += "El email debe tener @";
			}
			String dominio = email.substring(email.indexOf("@"));
			if(!dominio.contains(".")) {
				isValido = false;
				mensaje += "El email debe tener un . despues del @.";
			}
			if(!isValido) {
				System.out.println("El email " + email + " no es valido. " + mensaje );
			}
		}
	}
}