package golosinas;

public class Caramelo extends Golosina{
	
	public Caramelo() {
		this.name = "Caramelo";
		this.precio = 1;
		this.peso = 5;
		this.sabor = "frutilla";
		this.libreGluten = true;
	}

	@Override
	public void mordisco() {
		peso = peso-1;
	}
}
