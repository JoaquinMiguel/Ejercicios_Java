package semillas;

import java.util.ArrayList;

import parcelas.Parcelas;

public class SojaTransgenica extends Soja{

	public SojaTransgenica(int _anio, float _altura) {
		super(_anio, _altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean esFuerte() {
		return false;
	}
	
	@Override
	public boolean esIdeal(Parcelas parcela) {
		ArrayList<Plantas> lista = parcela.lista();
		return lista.size() == 1;
	}
}
