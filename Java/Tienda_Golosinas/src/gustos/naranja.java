package gustos;

public class naranja extends Gustos{

	public naranja() {
		this.name = "naranja";
	}
	
	public Gustos siguiente() {
		Gustos frutilla = new frutilla();
		return frutilla;
	}
}
