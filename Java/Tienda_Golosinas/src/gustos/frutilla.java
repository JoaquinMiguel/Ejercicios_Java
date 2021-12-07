package gustos;

public class frutilla extends Gustos{

	public frutilla() {
		this.name = "frutilla";
	}
	
	public Gustos siguiente() {
		Gustos chocolate = new chocolate();
		return chocolate;
	}
	
}

