package Cine;

public class Sala3D extends Sala{

	public Sala3D() {
		super();
	}

	public Sala3D(int numSala, int valorAsiento, int cantAsientos) {
		super(numSala, valorAsiento, cantAsientos);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}
	
}
