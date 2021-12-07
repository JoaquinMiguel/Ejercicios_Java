package golosinas;

import gustos.*;

public class TuttiFrutti extends Golosina{
	
	private Gustos tipoGusto =  new frutilla();
	
	public TuttiFrutti() {
		this.name = "TuttiFrutti";
		this.peso = 5;
		this.libreGluten = true;
		this.sabor = tipoGusto.name;
		}
	
	@Override
	public void mordisco() {
		corrigo();
		this.sabor = tipoGusto.name;
	}
	
	private void corrigo() {
		tipoGusto = tipoGusto.siguiente();
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

