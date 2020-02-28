package PruebaIndividual;

public class Television extends Electrodomesticos{
	
	//Definicion de atributos constantes y variables
	final static int RESOLUCION = 20;
	private boolean sintonizadorTDT = false;
	
	private int resolucion;
	
	//Declaracion de constructores
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
	
	//Declaracion de Get
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	//Metodo precio final heredado de Electrodomesticos.
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
