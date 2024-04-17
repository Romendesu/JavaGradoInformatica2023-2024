package edu.ucjc.programacion.poo.herencia.instrumento;

public class BandaMusica {
private String nombre;
	
	public BandaMusica(String nombre) {
		super();
		this.nombre = nombre;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitarra guitarra = new Guitarra("Guitarra","Española",300,"Yamaha",5,"Madera");
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra","Española",300,"Yamaha",5,"Madera");
		Bateria bateria = new Bateria("Bateria", "Tipo1", 500.0, "Marca1", 2,3);
		Piano piano = new Piano("Piano", "Cola", 1000, "Marca1", 5, 3);
		
		Instrumento [] instrumentos = {guitarra,bateria,piano,guitarraElectrica};
		Instrumento guitarra2 = new Guitarra("Guitarra2","Española",300,"Yamaha",5,"Madera");
		guitarra2.tocar();
		guitarra2.afinar();
		
		BandaMusica banda = new BandaMusica("Nombre Banda");
		banda.iniciarConcierto(instrumentos);
		bateria.aporrear();
	}
	private void iniciarConcierto(Instrumento [] instrumentos) {
		for (Instrumento instrumento: instrumentos) {
			instrumento.afinar();
		}
		System.out.println();
		for (Instrumento instrumento: instrumentos) {
			instrumento.tocar();
			if (instrumento instanceof Bateria) {
				((Bateria)instrumento).aporrear();
			}
		}		
	}
}
