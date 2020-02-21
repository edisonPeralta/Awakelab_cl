package Cine;

public class Sala2D extends Sala{

	public Sala2D() {
		super();
	}

	public Sala2D(int numSala, int valorAsiento, int cantAsientos) {
		super(1, 2000, 40);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

}
