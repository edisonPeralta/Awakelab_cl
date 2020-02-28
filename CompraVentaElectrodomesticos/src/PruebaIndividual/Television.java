package PruebaIndividual;

public class Television extends Electrodomesticos{
	
	final static int RESOLUCION = 20;
	boolean sintonizadorTDT = false;
	
	int resolucion;
	
	public Television() {
		super();
	}

	public Television( int resolucion, boolean sintonizadorTDT) {
		super();
		this.sintonizadorTDT = sintonizadorTDT;
		this.resolucion = resolucion;
	}

	public Television(double precioBase, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso);
		this.sintonizadorTDT = sintonizadorTDT;
		this.resolucion = resolucion;
	}

	public Television(double precioBase, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.sintonizadorTDT = sintonizadorTDT;
		this.resolucion = resolucion;
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public double precioFinal() {
	
		double valor = super.precioFinal();
		
		if (resolucion>40) {
			valor= valor+(valor*100/30);
		}
		
		if(sintonizadorTDT== true) {
			valor = valor+50;
		}
		
		return valor;
		
	}

}
