package semillas;

import parcelas.Parcelas;

public abstract class Plantas {
	
	public int anio, horasDeSol;
	public float altura;
	double espacio;
	
	public Plantas(int _anio, float _altura) {
		this.anio = _anio;
		this.altura = _altura;
	}

	public boolean esFuerte() {
		return (this.horasDeSol > 10);
	}

	public boolean daSemillas() {
		return (this.esFuerte() || condicionAlterna());
	}
	
	public abstract boolean condicionAlterna();
	
	public double espacio() { //get
		return this.espacio;
	}
	
	public float horas() {
		return horasDeSol;
	}
	
	public abstract boolean esIdeal(Parcelas parcela);
}
