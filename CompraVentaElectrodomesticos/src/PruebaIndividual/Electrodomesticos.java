package PruebaIndividual;

public class Electrodomesticos {

	static final int PRECIO_BASE = 100;
	static final String COLOR = "blanco";
	static final char CONSUMO_ENERGETICO = 'F';
	static final int PESO = 5;
	
	double precioBase;
	double peso;
	String color;
	char consumoEnergetico;
	
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

	/*	public int getPRECIO_BASE() {
*		return PRECIO_BASE;
*	}
*
*	public String getCOLOR() {
*		return COLOR;
*	}
*
*	public String getCONSUMO_ENERGETICO() {
*		return CONSUMO_ENERGETICO;
*	}
*
*	public int getPESO() {
*		return PESO;
*	}
*/
	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		
		char a=' ';
		
		String cadena = "abcdefABCDEF";
		
		for (int i = 0; i < cadena.length(); i++){
		    char letra = cadena.charAt(i);
		    
		    if(consumoEnergetico == letra){
		    	
		    	a=letra;
		    }else {
		    	a=CONSUMO_ENERGETICO;
		    }	
		}
		
		return a;
	}
	
	public String comprobarColor(String color) {
		
		color.toLowerCase();
		String pintar="";
		
		switch(color){
           case "blanco":
        	   pintar = color;
               break;
           case "negro":
        	   pintar = color;
               break;
           case "rojo":
        	   pintar = color;
               break;
           case "azul":
        	   pintar = color;
               break;
           case "gris":
        	   pintar = color;
               break;
           default:
        	   pintar = COLOR;
        }
		return pintar;
	}
	
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
