package Cine;

public class SalaImax extends Sala{
	
	public SalaImax() {
		super();
	}

	public SalaImax(int numSala, int valorAsiento, int cantAsientos) {
		super(3, 5000, 45);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

}
