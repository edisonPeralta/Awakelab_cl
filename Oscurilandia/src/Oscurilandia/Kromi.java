package Oscurilandia;


public class Kromi extends Carro{
	
	private int año; //año de fabricación de la Kromi	
	private String marca; // marca de la Kromi

	public Kromi() {
		super();
	}
	
	public Kromi(int cantidadOcup, String fechaingreso, int ubicaciónTableroF, int ubicaciónTableroC, int año, String marca) {		
		super(cantidadOcup, fechaingreso, ubicaciónTableroF, ubicaciónTableroC);
		this.año = año;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public void datosCarro() {
		// TODO Auto-generated method stub
		
	}
	
}
