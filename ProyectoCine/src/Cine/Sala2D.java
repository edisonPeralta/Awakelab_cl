package Cine;

public class Sala2D extends Sala{
	
	

	public Sala2D() {
		super();
	}

	public Sala2D(int numSala, int valorAsiento, int cantAsientos) {
		super(numSala, valorAsiento, cantAsientos);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

}
