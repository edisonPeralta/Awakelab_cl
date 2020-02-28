package PruebaIndividual;

public class Ejecutable {

	public static void main(String[] args) {

		//Creación de arreglo para los objetos con 10 posiciones.
		Electrodomesticos objElectronicos[]= new Electrodomesticos[10];
		
		//Creación de diferentes objetos con sus datos.
		objElectronicos[0] = new Lavadora(50,40,"blanco",'B',6);
		objElectronicos[1] = new Television(100,35,"negro",'F',55,true);
		objElectronicos[2] = new Electrodomesticos(50,30);
		objElectronicos[3] = new Lavadora(70,50,8);
		objElectronicos[4] = new Television(85,55,60,true);
		objElectronicos[5] = new Electrodomesticos(70,45,"verde",'A');
		objElectronicos[6] = new Lavadora(60,45,"rojo",'C',4);
		objElectronicos[7] = new Television(96,40,"azul",'E',65,false);
		objElectronicos[8] = new Electrodomesticos(50,50);
		objElectronicos[9] = new Lavadora(85,34,"blanco",'A',4);
		
		//Variables de suma y contadores.
		double sumaElectrodomesticos=0;
		int conElectrodomesticos=0;
		double sumaLavadoras=0;
		int conLavadoras=0;
		double sumaTelevision=0;
		int conTelevision=0;
		
		//For para recorrer los 10 Objetos con 'instanceof' para capturar los valores deacuerdo a su Clase.
		for(int i=0;i<objElectronicos.length;i++){
		
			//Codigo de impresión de prueba de cada clase.
//			System.out.println("Presio: "+objElectronicos[i].getPrecioBase()+", Peso; "+objElectronicos[i].getPeso()+", Color: "+objElectronicos[i].getColor()+", Consumo: "+objElectronicos[i].getConsumoEnergetico());
			
			if(objElectronicos[i] instanceof Electrodomesticos){
				sumaElectrodomesticos = sumaElectrodomesticos+objElectronicos[i].precioFinal();
				conElectrodomesticos++;
			}
			if(objElectronicos[i] instanceof Lavadora){
				sumaLavadoras = sumaLavadoras+objElectronicos[i].precioFinal();
				conLavadoras++;
			}
			if(objElectronicos[i] instanceof Television){
				sumaTelevision = sumaTelevision+objElectronicos[i].precioFinal();
				conTelevision++;
			}
			
		}
		
		//Impresión de los totales.		
		System.out.println("==============================================================");
		System.out.println("");
		System.out.println("El valor de los Televisores es: "+sumaTelevision+"€");
		System.out.println("Total vendidos: "+conTelevision);
		System.out.println("");
		System.out.println("El valor de las Lavadoras es: "+sumaLavadoras+"€");
		System.out.println("Total vendidos: "+conLavadoras);
		System.out.println("");
		System.out.println("El valor de los Electrodomesticos es: "+(sumaElectrodomesticos+sumaLavadoras+sumaTelevision)+"€");
		System.out.println("Total vendidos: "+conElectrodomesticos);
		System.out.println("");
		System.out.println("==============================================================");
		
	}

}
