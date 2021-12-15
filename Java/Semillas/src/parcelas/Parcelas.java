package parcelas;
import semillas.*;

import java.util.ArrayList;

public class Parcelas {
	private final float ancho, largo;
	private int horasDeSol;
	private ArrayList<Plantas> listaPlanta = new ArrayList<Plantas>();
	
	public Parcelas(float ancho, float largo, int horas) {
		this.ancho = ancho;
		this.largo = largo;
		this.horasDeSol = horas;
	}
	
	public float superficie() {
		return this.ancho * this.largo;
	}
	
	public void plantar(Plantas semilla) {
		 listaPlanta.add(semilla);
	}
	
	public float cantMaxima() {
		if (this.ancho > this.largo) return (superficie() / 5);
		return superficie() / 3 + this.largo;
	}
	
	public boolean tieneComplicaiones() {
		return listaPlanta.stream()
		.anyMatch( planta -> planta.horas() < this.horasDeSol);
	}
	
	
}
