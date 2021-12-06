package golosinas;

public class Chupetin extends Golosina{

	public Chupetin() {
		this.name = "Chupetin";
		this.precio = 2;
		this.peso = 7;
		this.sabor = "naranja";
		this.libreGluten = true;
	}

	@Override
	public void mordisco() {
		if (peso >= 2) {
			peso = peso* 0.9;
		}
	}
}
