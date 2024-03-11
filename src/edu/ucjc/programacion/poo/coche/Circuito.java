package edu.ucjc.programacion.poo.coche;
public class Circuito {
	public void main(String[] args) {
		// Creacion del primer coche
		Piston piston1 = new Piston(1,"Marca1");
		Motor motor1 = new Motor("MarcaMotor1",120,piston1);
		Volante volante1 = new Volante(1,"Deportivo","Negro");
		Coche coche1 = new Coche("1111-ABC", "FIAT-500", volante1,motor1);
		coche1.setVelocidad(Math.random()*120);
		// Creacion del segundo coche
		Piston piston2 = new Piston(1,"Marca2");
		Motor motor2 = new Motor("MarcaMotor2",120,piston2);
		Volante volante2 = new Volante(1,"Deportivo","Blanco");
		Coche coche2 = new Coche("2222-DEF", "SEAT-500", volante2,motor2);
		coche2.setVelocidad(Math.random()*120);
		// Mostrar
		Coche[] coches = {coche1,coche2};
		
		arrancarCoches(coches);
	}
	private static void arrancarCoches(Coche[] coches) {
		for(Coche coche : coches) {
			coche.conducir();
		}
	}
}
