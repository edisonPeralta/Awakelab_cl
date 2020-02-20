package Ejemplo02;

import java.util.Scanner;

public class Ejecutable {

	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Producto producto[]= new Producto[10];
		
		for(int i=0;i<5;i++) {
				
			producto[i]=new Perecedero();
			
			System.out.println("Agregue Nombre de "+(i+1)+"° Producto Perecedero");
			producto[i].setNombre(scan.next());
			System.out.println("Agregue Precio de "+(i+1)+"° Producto Perecedero");
			producto[i].setPrecio(scan.nextInt());
			System.out.println("Agregue Cantidad de Productos");
			producto[i].setCant(scan.nextInt());
			System.out.println("Agregue Días para caducar");
			((Perecedero)producto[i]).setDias_caduca(scan.nextInt());
			
        }
		
		for(int i=5;i<10;i++) {
			
			producto[i]=new NoPerecedero();
			
			System.out.println("Agregue Nombre de Producto no perecedero");
			producto[i].setNombre(scan.next());
			System.out.println("Agregue Precio de Producto no perecedero");
			producto[i].setPrecio(scan.nextInt());
			System.out.println("Agregue Cantidad");
			producto[i].setCant(scan.nextInt());
			System.out.println("Agregue Tipo");
			((NoPerecedero)producto[i]).setTipo(scan.next());
			
        }
		
		
		
		for(int i=0;i<10;i++) {
			
			if (i<=4) {
				
				System.out.println("=======================================");
				System.out.println("Producto Perecedero N° "+(i+1)+" :");
				System.out.println("Días para Caducar: "+((Perecedero)producto[i]).getDias_caduca());
			
			}
			
			if (i>4 & i<10) {
				
				System.out.println("=======================================");
				System.out.println("Producto No Perecedero N° "+(i+1)+" :");
				System.out.println("Tipo: "+((NoPerecedero)producto[i]).getTipo());
			
			}
				
				System.out.println("Nombre: "+producto[i].getNombre());
				System.out.println("Cantidad: "+producto[i].getCant());
				System.out.println("Total: "+producto[i].calcular());				
			
		}
	
	}
	
}
