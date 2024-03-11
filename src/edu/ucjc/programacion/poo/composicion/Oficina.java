package edu.ucjc.programacion.poo.composicion;

public class Oficina {
	public static void main(String [] args) {
		Silla silla = new Silla(1,"blanco",100);
		Mesa mesa = new Mesa(1,"blanco",200);
		
		Despacho despacho1 = new Despacho("despacho1");
		Despacho despacho2 = new Despacho("despacho2",mesa,silla);
		
		//System.out.println(despacho1.getSilla());
		//System.out.println(despacho2.getSilla().getColor());
		
		despacho1.setSilla(silla);
		despacho2.getSilla().setColor("Azul");
		System.out.println(despacho1.getSilla().getColor());
		System.out.println(despacho2.getSilla().getColor());
	}
}
