package Cine;

public class Sala3D extends Sala{

	public Sala3D() {
		super();
	}

	public Sala3D(int numSala, int valorAsiento, int cantAsientos) {
		super(2, 3000, 35);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}
	
}
