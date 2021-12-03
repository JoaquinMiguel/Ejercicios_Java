package golosinas;

public class Alfajor extends Golosina{

	//String nombre = "Alfajor";
	public Alfajor() {
		this.name = "Alfajor";
		this.precio = 12;
		this.peso = 300;
		this.sabor = "chocolate";
		this.libreGluten = false;		
	}
	
	public void mordisco() {
		peso = (peso * 0.8);
	}

	/*@Override
	public String toString() {
		return nombre;
	}
	*/

}
