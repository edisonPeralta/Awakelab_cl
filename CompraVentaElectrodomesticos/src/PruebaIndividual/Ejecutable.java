package PruebaIndividual;

public class Ejecutable {

	public static void main(String[] args) {

		Electrodomesticos objElectrodomesticos[] = new Electrodomesticos[10];
		
		objElectrodomesticos[0] = new Lavadora (40,15,35);
		objElectrodomesticos[1] = new Television (50,60,55,false);
		objElectrodomesticos[2] = new Lavadora (50,15,"azul",'d',35);
		objElectrodomesticos[3] = new Television (27,43,"rojo",'a',15,true);
		objElectrodomesticos[4] = new Lavadora (40,15,35);
		objElectrodomesticos[5] = new Television (35,20,55,true);
		objElectrodomesticos[6] = new Lavadora (40,20,35);
		objElectrodomesticos[7] = new Television (32,30,45,false);
		objElectrodomesticos[8] = new Lavadora (40,15,35);
		objElectrodomesticos[9] = new Television (35,20,55,true);
		
		double electrodomesticos=0;
		int conElectrodomesticos=0;
		double lavadoras=0;
		int conLavadoras=0;
		double television=0;
		int conTelevision=0;
		
		for(int i=0;i<objElectrodomesticos.length;i++){
			
			if(objElectrodomesticos[i] instanceof Electrodomesticos){
				electrodomesticos = objElectrodomesticos[i].precioFinal();
				conElectrodomesticos++;
			}
			if(objElectrodomesticos[i] instanceof Lavadora){
				lavadoras = objElectrodomesticos[i].precioFinal();
				conLavadoras++;
			}
			if(objElectrodomesticos[i] instanceof Television){
				television = objElectrodomesticos[i].precioFinal();
				conTelevision++;
			}
			
		}
		
		System.out.println("==============================================================");
		System.out.println("");
		System.out.println("El valor de los Televisores es: "+television+"€");
		System.out.println("Total vendidos: "+conTelevision);
		System.out.println("");
		System.out.println("El valor de las Lavadoras es: "+lavadoras+"€");
		System.out.println("Total vendidos: "+conLavadoras);
		System.out.println("");
		System.out.println("El valor de los Electrodomesticos es: "+electrodomesticos+"€");
		System.out.println("Total vendidos: "+conElectrodomesticos);
		System.out.println("");
		System.out.println("==============================================================");
		
	}

}
