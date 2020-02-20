package Ejemplo02;

import java.util.Scanner;

public class Ejecutable {

	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Producto producto[]= new Producto[10];
		
	/*	Perecedero producto[]= new Perecedero[5];*/
		
		for(int i=0;i<5;i++) {
				
			producto[i]=new Perecedero();
			
			System.out.println("Agregue Nombre de "+(i+1)+"° Producto Perecedero");
			producto[i].setNombre(scan.next());
			System.out.println("Agregue Precio de "+(i+1)+"° Producto");
			producto[i].setPrecio(scan.nextInt());
			System.out.println("Agregue Cantidad de Productos");
			producto[i].setCant(scan.nextInt());
			System.out.println("Agregue Días para caducar");
			producto[i].setDias_caduca(scan.nextInt());
			
        }
		
	/*	NoPerecedero producto2[]= new NoPerecedero[5];
		
		for(int i=0;i<5;i++) {
			
			producto2[i]=new NoPerecedero();
			
			System.out.println("Agregue Nombre de "+(i+1)+"° Producto no perecedero");
			producto2[i].setNombre(scan.next());
			System.out.println("Agregue Precio de "+(i+1)+"° Producto");
			producto2[i].setPrecio(scan.nextInt());
			System.out.println("Agregue Cantidad de Productos");
			producto2[i].setCant(scan.nextInt());
			System.out.println("Agregue Tipo de producto");
			producto2[i].setTipo(scan.next());
			
        } */
		
		int contador=0;
		
		for(int i=0;i<10;i++) {
			
			if (i<=4) {
				System.out.println("=======================================");
				System.out.println("Producto Perecedero N° "+(i+1)+" :");
				System.out.println("Nombre: "+producto[i].getNombre());
				System.out.println("Cantidad: "+producto[i].getCant());
				System.out.println("Días para Caducar: "+producto[i].getDias_caduca());
				System.out.println("Total: "+producto[i].calcular());
			}
			
			if (i>4 & i<10) {
				System.out.println("=======================================");
				System.out.println("Producto no Perecedero N° "+(i+1)+" :");
				System.out.println("Nombre: "+producto2[contador].getNombre());
				System.out.println("Cantidad: "+producto2[contador].getCant());
				System.out.println("Tipo: "+producto2[contador].getTipo());
				System.out.println("Total: "+producto2[contador].calcular());
				contador++;
			}
			
		}
	
	}
	
}
