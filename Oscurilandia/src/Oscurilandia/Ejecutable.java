package Oscurilandia;

import java.util.*;

public class Ejecutable {
	
	public static void main(String[] args) {
			
		Tablero tablerito = new Tablero();
			
		System.out.println("==================================");
		System.out.println("¡Bienvenido al simulador de ataque!");
		System.out.println("==================================");
		System.out.println("¿qué deseas hacer?");
		System.out.println("");
		System.out.println("Si deseas jugar presiona [1]\nSi deseas salir presiona [2]");
			
		Scanner opciones = new Scanner(System.in);
		int a = opciones.nextInt();
		
		switch (a) {
			
			case 1:
				tablerito.lanzarHuevo();
				break;
			case 2: System.out.println("Hasta la proxima :)");
			
		opciones.close();
			
		}
			
	}
		
}
