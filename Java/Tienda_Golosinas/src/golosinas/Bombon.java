package golosinas;

// hacer clases de cada dulce.
public class Bombon extends Golosina{
	//String nombre = "Bombon";
	public Bombon() {
		this.name = "Bombon";
		this.precio = 5;
		this.peso = 15;
		this.sabor = "frutilla";
		this.libreGluten = true;
	}
	
	@Override
	public void mordisco() {
		peso = (peso * 0.8) - 1;
	}

	/*@Override
	public String toString() {
		return nombre;
	}
	*/
	
}

