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
		
		for (int i=0; i<4; i++){
			for (int j=0; i<4; i++){
				System.out.println("Elija Pelicula.");
				System.out.println(objFunciones.funcion[i][j]);
			}
		}
		
		
		objCliente.compraCliente();
		
		
		//objFunciones.reservar(objCliente.compraCliente(), dimension, asientos)
		
	}

}
