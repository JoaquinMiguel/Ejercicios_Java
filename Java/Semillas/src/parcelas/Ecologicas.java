package parcelas;

import semillas.Plantas;

public class Ecologicas extends Parcelas{

	public Ecologicas(float ancho, float largo, int horas) {
		super(ancho, largo, horas);

	}

	@Override
	public boolean seAsociaBien(Plantas semilla) {
		return !this.tieneComplicaiones() && semilla.esIdeal(this);
		
	}
	
}
