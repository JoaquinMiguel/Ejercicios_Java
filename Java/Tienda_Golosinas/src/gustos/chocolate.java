package gustos;

public class chocolate extends Gustos{

	public chocolate() {
		this.name = "chocolate";
	}
	
	public Gustos siguiente() {
		Gustos naranja = new naranja();
		return naranja;
	}
}
