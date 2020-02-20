package Cine;

public class Sala4DX extends Sala{

	public Sala4DX() {
		super();
	}

	public Sala4DX(int numSala, int valorAsiento, int cantAsientos) {
		super(numSala, valorAsiento, cantAsientos);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

	
}
