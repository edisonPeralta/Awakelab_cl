package Oscurilandia;


public class Kromi extends Carro{
	
	private int a�o; //a�o de fabricaci�n de la Kromi	
	private String marca; // marca de la Kromi

	public Kromi() {
		super();
	}
	
	public Kromi(int cantidadOcup, String fechaingreso, int ubicaci�nTableroF, int ubicaci�nTableroC, int a�o, String marca) {		
		super(cantidadOcup, fechaingreso, ubicaci�nTableroF, ubicaci�nTableroC);
		this.a�o = a�o;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public void datosCarro() {
		// TODO Auto-generated method stub
		
	}
	
}
