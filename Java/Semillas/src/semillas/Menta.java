package semillas;

import parcelas.Parcelas;

public class Menta extends Plantas {

	public Menta(int _anio, float _altura) {
		super(_anio, _altura);
		
		this.horasDeSol = 6;
		this.espacio = this.altura * 3;
	}

	@Override
	public boolean condicionAlterna() {
		return (this.altura > 0.4);
	}

	@Override
	public boolean esIdeal(Parcelas parcela) {
		return parcela.superficie() > 6;
	}



}
