package golosinas;

import gustos.frutilla;
public class TuttiFrutti extends Golosina{

	
	public TuttiFrutti() {
		this.peso = 5;
		this.libreGluten = true;
		this.sabor = ((Golosina) frutilla).gusto();
		}
	
	//private Object x = frutilla;
	/*
	 * poner atributos aca o hacer clases pero enrealidad son objetos!!
	 */
	
	@Override
	public void mordisco() {
		this.sabor = sabor.gusto();
		x = x.siguiente();
	}
	
	public void setLibreGluten(boolean bool) {//setter
		this.libreGluten= bool;
	}
	
	@Override
	public double precio() {
		if (this.isLibreGluten()) this.precio = 7;
		else this.precio = 10;
		return precio;
	}
	
}

