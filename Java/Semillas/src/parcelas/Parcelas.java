package parcelas;
import semillas.*;

import java.util.ArrayList;

public abstract class Parcelas {
	protected final float ancho, largo;
	protected int horasDeSol;
	protected ArrayList<Plantas> listaPlanta = new ArrayList<Plantas>();
	
	public Parcelas(float ancho, float largo, int horas) {
		this.ancho = ancho;
		this.largo = largo;
		this.horasDeSol = horas;
	}
	
	public float superficie() {
		return this.ancho * this.largo;
	}
	
	public void plantar(Plantas semilla) {
		if( listaPlanta.size() > cantMaxima() || tieneMasHoras(semilla)) {
			System.out.println("ERROR");
		}
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
	
	public boolean tieneMasHoras(Plantas semilla) {
		return (this.horasDeSol - semilla.horasDeSol) >= 2;
	}
	
	public abstract boolean seAsociaBien(Plantas semilla);
	
	public ArrayList<Plantas> lista(){
		return listaPlanta;
	}
	
	public int horas() {
		return this.horasDeSol;
	}
	
	public int cantPlantas() {
		return listaPlanta.size();
	}
	
}
