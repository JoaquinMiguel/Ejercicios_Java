package semillas;

public abstract class Plantas {
	
	public int anio;
	public float altura, horasDeSol;
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
	
}
