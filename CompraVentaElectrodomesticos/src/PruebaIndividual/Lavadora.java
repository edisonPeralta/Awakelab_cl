package PruebaIndividual;

public class Lavadora extends Electrodomesticos{
	
	static final int CARGA = 5;
	
	int carga;
	

	public Lavadora() {
		super();
	}
	
	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}

	public Lavadora(double precioBase, double peso, int carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public double precioFinal() {

		double valor = super.precioFinal();
		
		if (carga>30) {
			valor= valor+ 50;
		}
		
		return valor;
		
	}
	
}
