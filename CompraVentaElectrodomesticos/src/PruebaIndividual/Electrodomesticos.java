package PruebaIndividual;

public class Electrodomesticos {

	//Declaración atributos constantes
	static final int PRECIO_BASE = 100;
	static final String COLOR = "blanco";
	static final char CONSUMO_ENERGETICO = 'F';
	static final int PESO = 5;
	
	double precioBase;
	double peso;
	String color;
	char consumoEnergetico;
	
	//Constructores
	public Electrodomesticos() {
		
	}

	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomesticos(double precioBase, double peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	//mMetodos Get
	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	//Metodo para asegurar que consumo enerjetico sea entre 'A' y 'F' en caso de no existir asume por defecto 'F'
	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		
		String cadena = "abcdefABCDEF";
		
		for (int i = 0; i < cadena.length(); i++){
		    char letra = cadena.charAt(i);
		    
		    if(consumoEnergetico == letra){
		    	
		    	this.consumoEnergetico=letra;
		    }else {
		    	this.consumoEnergetico=CONSUMO_ENERGETICO;
		    }	
		}
		
		return consumoEnergetico;
	}
	
	//Metodo para asegurar que color sea entre "blanco, negro, rojo, azul, gris" si no este sera por defecto Blanco
	public String comprobarColor(String color) {
		
		color.toLowerCase();
		
		switch(color){
           case "blanco":
        	   this.color = color;
               break;
           case "negro":
        	   this.color = color;
               break;
           case "rojo":
        	   this.color = color;
               break;
           case "azul":
        	   this.color = color;
               break;
           case "gris":
        	   this.color = color;
               break;
           default:
        	   this.color = COLOR;
        }
		return color;
	}
	
	////Metodo para sumar los valores segun su consumo energetico y su peso.
	public double precioFinal() {
		
		double aumento=0;
		
        if(consumoEnergetico== 'A'){
        	aumento=aumento+100;
        }else if(consumoEnergetico== 'B') {
        	aumento=aumento+80;
        }else if(consumoEnergetico== 'C') {
        	aumento=aumento+60;
        }else if(consumoEnergetico== 'D') {
        	aumento=aumento+50;
        }else if(consumoEnergetico== 'E') {
        	aumento=aumento+30;
        }else if(consumoEnergetico== 'F') {
        	aumento=aumento+10;
        }
   
        if(peso>=0 && peso<19){
        	aumento=aumento+10;
        }
        if(peso>=20 && peso<49){
        	aumento=aumento+50;
        }
        if(peso>=50 && peso<=79){
        	aumento=aumento+80;
        }
        if(peso>=80){
        	aumento=aumento+100;
        }
   
        return precioBase+aumento;
		
	}
}
