/*package Oscurilandia;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		
		Tablerodos table= new Tablerodos();
		System.out.println("==================================");
		System.out.println("¡Bienvenido al simulador de ataque!");
		System.out.println("==================================");
		System.out.println("¿qué deseas hacer?");
		System.out.println("");
		System.out.println("Si deseas jugar presiona [1]\n Si deseas salir presiona [2]");
		Scanner opciones = new Scanner(System.in);
		int a = opciones.nextInt();
		switch (a) {
		case 1:
			table.lanzarHuevo();
				break;
		case 2: System.out.println("Hasta la proxima :)");		
		}
		
	}

}*/
package Oscurilandia;
import java.util.*;
	public class Ejecutable {
		public static void main(String[] args) {
			Tablerodos tablerito = new Tablerodos();
			System.out.println("==================================");
			System.out.println("¡Bienvenido al simulador de ataque!");
			System.out.println("==================================");
			System.out.println("¿qué deseas hacer?");
			System.out.println("");
			System.out.println("Si deseas jugar presiona [1]\n Si deseas salir presiona [2]");
			Scanner opciones = new Scanner(System.in);
			int a = opciones.nextInt();
			switch (a) {
			case 1:
					tablerito.lanzarHuevo();
					break;
			case 2: System.out.println("Hasta la proxima :)");		
			}
		}
	}
