package Oscurilandia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
	
	int Carro [];
	int huevo[];
	
	
	int casilla[][] = new int[15][15];
	
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
	
	public void crearCarro() {
		
		Carro objCarro = new Kromi();
		
		
	}
	
	public void lanzarHuevo(int largo, int ancho) {
		
		int x;
		int y;
		for (x=0;x<largo;x++) {
			for (y=0;y<ancho;y++) 
			{
				casilla[x][y]=0;
			}
		}
		
		Scanner read = new Scanner(System.in);
		int a=0;
		int letraA=0;
		int letraB=0;
		String z;
		{
			System.out.println("Elija un Casillero a lanzar Huevo Ej:'XX'");
			z = read.nextLine();
			
			for (int i = 0; i < z.length(); i++){
			    char letra = z.charAt(i);
			    if(i==0) {
			    	letraA= z.charAt(i);
			    }
			    
			    if(i==1) {
				    letraB= z.charAt(i);
				}
			}
					
			System.out.println("");
			if (casilla[letraA-1][letraB-1]==0) {
				a = a+1;
				casilla[letraA-1][letraB-1]=1;
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
				if (casilla[i][j]==1) 
				{
					
					System.out.print("[ ]");
					
				}
				if (casilla[i][j]==0) 
				{
					//System.out.print("XX - ");
					System.out.print("["+"H"+"]");
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
					System.out.print("|   |");
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
