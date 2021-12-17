package semillas;

import parcelas.Parcelas;

public class Soja extends Plantas{



	public Soja(int _anio, float _altura) {
		super(_anio, _altura);
		
		this.horasDeSol = calculo();
		this.espacio = this.altura / 2;
	}

	private int calculo() {
		if (this.altura < 0.5) return 6;
		else if(this.altura > 0.5 && this.altura < 1) return 7;
		else return 9;
	}

	@Override
	public boolean condicionAlterna() {
		return (this.anio> 2017 && this.altura > 1);
	}

	@Override
	public boolean esIdeal(Parcelas parcela) {
		
		return parcela.horas() == this.horasDeSol;
	}
	
}
