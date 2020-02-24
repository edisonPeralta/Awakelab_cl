package Oscurilandia;

import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
	
	int Carro [];
	int huevo[];
	
	int largo=15;
	int ancho=15;
	
	public Tablero() {

	}
	
	public Tablero(int[] carro, int[] huevo) {
		super();
		Carro = carro;
		this.huevo = huevo;
	}

	public int[] getCarro() {
		return Carro;
	}

	public void setCarro(int[] carro) {
		Carro = carro;
	}

	public int[] getHuevo() {
		return huevo;
	}

	public void setHuevo(int[] huevo) {
		this.huevo = huevo;
	}

	public String toString() {
		return "Tablero [Carro=" + Arrays.toString(Carro) + ", huevo=" + Arrays.toString(huevo) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int crearCarro() {
		return 0;
	}
	
	public int lanzarHuevo() {
		
		Huevo objHuevo = new Huevo();
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese Fila a lanzar Huevo");
		objHuevo.setFila(leer.nextLine());
		System.out.print("Ingrese Columna a lanzar Huevo");
		objHuevo.setColumna(leer.nextLine());
		
		leer.close();
		
		return 0;
		
	}
	
	public void mostrarMatriz () {
		
		int j;
		int i;
		int k = 0;
		for (i=0;i<15;i++) {
			
			System.out.println("____________________________________________________________");
			
			for (j=0;j<15;j++) {
				
				if (j==14) {
					System.out.print("| "+k+"|");					
				}else {
					System.out.print("| "+k+" ");
				}
					
			}
			
			System.out.println("");
		}
		
	}
	
	public int calcularPuntaje() {
		return 0;
	}
	
}
