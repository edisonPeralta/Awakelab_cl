package Oscurilandia;


public class Caguano extends Carro {
	
	private int alcanceTiro; // alcance de tiro del Caguano	
	private String ColorConfetti; //color del confeti que tira
	
	public Caguano() {
		super();		
	}
	
	public Caguano(int cantidadOcup, String fechaingreso, int ubicaci�nTableroF, int ubicaci�nTableroC, int alcanceTiro, String colorConfetti) {		
		super(cantidadOcup, fechaingreso, ubicaci�nTableroF, ubicaci�nTableroC);		
		this.alcanceTiro = alcanceTiro;		
		this.ColorConfetti = colorConfetti;
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfetti() {
		return ColorConfetti;
	}

	public void setColorConfetti(String colorConfetti) {
		ColorConfetti = colorConfetti;
	}

	@Override
	public void datosCarro() {
		
	}

}
