package parcelas;

import semillas.Plantas;

public class Industriales extends Parcelas{

	public Industriales(float ancho, float largo, int horas) {
		super(ancho, largo, horas);
	}

	@Override
	public boolean seAsociaBien(Plantas semilla) {
		return listaPlanta.size() <= 2 && semilla.esFuerte();
	}
	
}
