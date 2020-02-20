package Cine;

public class SalaImax extends Sala{
	
	public SalaImax() {
		super();
	}

	public SalaImax(int numSala, int valorAsiento, int cantAsientos) {
		super(numSala, valorAsiento, cantAsientos);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

}
