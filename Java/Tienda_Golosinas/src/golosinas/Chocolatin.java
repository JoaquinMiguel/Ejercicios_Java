package golosinas;

//import golosinas.gustos.chocolate;

public class Chocolatin extends Golosina{
	//private double precioDado;
	public Chocolatin(double _peso) {
		this.peso = _peso;
		this.precio = 0.5 * peso;
		this.sabor = "chocolate";
		this.libreGluten = false;
	}
	
	public void mordisco() {
		peso = peso -2;
	}
	
}
