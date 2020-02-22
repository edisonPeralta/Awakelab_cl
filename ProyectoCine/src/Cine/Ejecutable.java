package Cine;

import java.util.Scanner;

public class Ejecutable {
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		Cliente objCliente= new Cliente();
		Funciones objFunciones= new Funciones();
		
		/*System.out.println("======================");
		System.out.println("Elija tipo de Sala");
		System.out.println("1.- Sala 2D");
		System.out.println("2.- Sala 3D");
		System.out.println("3.- Sala 4DX");
		System.out.println("4.- Sala Imax");*/
		
		System.out.println("Elija Pelicula.");
		System.out.println(" ");
		System.out.println("N° SALA    NOMBRE PELICULA  HORARIO    TIPO DE SALA");
		
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){	
				
				System.out.print(objFunciones.funcion[i][j]);
				
			}
		}
		
		
		objCliente.compraCliente();
		
		
		//objFunciones.reservar(objCliente.compraCliente(), dimension, asientos)
		
	}

}
