package semillas;

public class Quinoa extends Plantas{

	public Quinoa(int _anio, float _altura, float horas) {
		super(_anio, _altura);
		this.horasDeSol = horas;
		this.espacio = 0.5;
	}

	@Override
	public boolean condicionAlterna() {
		return (this.anio < 2015);
	}

	
}
