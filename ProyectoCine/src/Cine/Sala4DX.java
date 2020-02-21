package Cine;

public class Sala4DX extends Sala{

	public Sala4DX() {
		super();
	}

	public Sala4DX(int numSala, int valorAsiento, int cantAsientos) {
		super(4, 7000, 30);
	}

	@Override
	public int recaudacionDia() {
		return 0;
	}

	
}
