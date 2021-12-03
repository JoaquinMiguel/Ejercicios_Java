package golosinas;

public class Oblea extends Golosina{

	public Oblea() {
		this.precio = 5;
		this.peso = 250;
		this.sabor = "vainilla";
		this.libreGluten = false;
	}

	@Override
	public void mordisco() {
		if (peso>70) peso = peso/2;
		else peso = peso*0.75;
	}
}
