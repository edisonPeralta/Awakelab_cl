package Oscurilandia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
	
	int Carro [];
	int huevo[];
	
	int largo=16;
	int ancho=16;
	int casilla[][] = new int[largo][ancho];
	
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
	
	public void lanzarHuevo(int largo, int ancho, int casilla[][]) {
		
		Scanner read = new Scanner(System.in);
		int a=0;
		int letraA=0;
		int letraB=0;
		String z;
		{
			System.out.println("Elija un Casillero a lanzar Huevo Ej:'XX'");
					z = read.nextLine();
					for (int i = 0; i < z.length; i++){
					    char letra = z.charAt(i);
					    if(i==0) {
					    	letraA= Integer.parseInt(z.charAt(i));
					    }
					    if(i==1) {
						    letraB= Integer.parseInt(z.charAt(i));
						}
					    //Tratamiento del caracter
					}
					
					System.out.println(""); 
					if (casilla[letraA-1][letraB-1]==1) 
					{
						a = a+1;
						casilla[letraA-1][letraB-1] = 0;
						mostrarMatriz(largo, ancho);
					} 
					
			}
		read.close();
	}
	
	public void mostrarMatriz (int largo, int ancho) {
		
		int i;
		int j;
		int k;
		k = 1;
		for (i=0;i<largo;i++) {
			for (j=0;j<ancho;j++) 
			{
				if (casilla[k][k]==1) 
				{
					if (k<10) 
					{
						System.out.print(" "+k+" - ");
					} else {
						System.out.print(k+" - ");
					}
				}
				if (casilla[k][k]==0) 
				{
					System.out.print("XX - ");
				}
				k = k+1;
			}
			System.out.println("");
		}
		
/*		for (i=0;i<largo;i++) {			
			
			System.out.println(" ___________________________________________________________");
			
			for (j=0;j<ancho;j++) {				
				
				if (j==15) {
					System.out.print("|   |");					
				}else {
					System.out.print("|   ");
				}
					
			}
			
			System.out.println("");
		}
		System.out.println(" ___________________________________________________________"); */
	}
	
	public int calcularPuntaje() {
		ArrayList huevo = new ArrayList();
		return 0;
	}
	
}
