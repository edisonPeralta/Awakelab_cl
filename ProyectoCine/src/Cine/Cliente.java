package Cine;

import java.util.Scanner;

public class Cliente {

	public int cantEntAdulto;
	public int cantEntNino;
	
	public Cliente() {
		
	}

	public Cliente(int cantEntAdulto, int cantEntNino) {
		this.cantEntAdulto = cantEntAdulto;
		this.cantEntNino = cantEntNino;
	}

	public int getCantEntAdulto() {
		return cantEntAdulto;
	}

	public void setCantEntAdulto(int cantEntAdulto) {
		this.cantEntAdulto = cantEntAdulto;
	}

	public int getCantEntNino() {
		return cantEntNino;
	}

	public void setCantEntNino(int cantEntNino) {
		this.cantEntNino = cantEntNino;
	}
	
	public int compraCliente() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de entradas de Niño");
		this.cantEntNino=scan.nextInt();
		
		System.out.println("Ingrese la cantidad de entradas de Adulto");
		this.cantEntAdulto=scan.nextInt();		
		
		scan.close();
		
		return cantEntAdulto+cantEntAdulto;		
	}
}
