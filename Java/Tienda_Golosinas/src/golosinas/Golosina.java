package golosinas;

public abstract class Golosina{ //al tener al menos UN metodo abstracto, es
								// obligacion hacer la clase abstracta
	public String name;
	public double precio, peso;
	public String sabor;
	public boolean libreGluten;
	
	
	
	public String getName() {return name;}
	
	public double peso() {return peso;}
	
	public String gusto() {return sabor;} //OJO
	
	public boolean isLibreGluten() {return libreGluten;}
	
	public double precio() {return precio;}
	
	public abstract void mordisco();


	
}