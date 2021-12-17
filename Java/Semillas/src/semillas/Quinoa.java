package semillas;

import java.util.ArrayList;

import parcelas.Parcelas;

public class Quinoa extends Plantas{

	public Quinoa(int _anio, float _altura, float horas) {
		super(_anio, _altura);
		this.horasDeSol = horas;
		this.espacio = 0.5;
	}

	@Override
	public boolean condicionAlterna() {
		return (this.anio < 2015);
	}

	@Override
	public boolean esIdeal(Parcelas parcela) {
		ArrayList<Plantas> aux = parcela.lista();
		return aux.stream()
		.anyMatch(planta -> planta.altura > 1.5);
	}

	
}
