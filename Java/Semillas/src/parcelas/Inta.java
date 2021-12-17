package parcelas;

import java.util.ArrayList;

public class Inta {
	private ArrayList<Parcelas> listaParcela = new ArrayList<Parcelas>();
	
	
	public void agregarParcela(Parcelas parcela) {
		listaParcela.add(parcela);
	}
	
	public float promedioPlantas() {
		return cantPlantas() / listaParcela.size();
	}
	
	
	public int cantPlantas() {
		return listaParcela.stream()
		.mapToInt(parcela -> parcela.cantPlantas())
		.sum();
	}
}
