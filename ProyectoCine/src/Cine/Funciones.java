package Cine;

import java.util.Scanner;

public class Funciones {
	
	 
	 
	/*private int horario;
	private String nombre;
	private int tipoSala;
	public int[] asiento;
	
	public Funciones() {
		
	}

	public Funciones(int horario, String nombre, int tipoSala, int dimension) {
		this.horario = horario;
		this.nombre = nombre;
		this.tipoSala = tipoSala;
		this.asiento= new int[dimension];
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(int tipoSala) {
		this.tipoSala = tipoSala;
	}*/

	public int reservar(int entrada , int dimension, int asientos[]) {
		Scanner read = new Scanner(System.in);
		int a=0;
		int z;
		while (a<entrada) 
		{
			System.out.println("elija asiento");
					z = read.nextInt();
					System.out.println(""); 
					if (asientos[z-1]==1) 
					{
						a = a+1;
						asientos[z-1] = 0;
						pintar(dimension, asientos);
					} 
					else 
					{
						System.out.println("asiento ocupado");
						System.out.println("");
						pintar(dimension, asientos);
					}
			}
		read.close();
	}
	
	public int pintar(int dimension, int asientos[]) {
		int i;
		int j;
		int k;
		k = 1;
		for (i=0;i<5;i++) {
			for (j=0;j<dimension/5;j++) 
			{
				if (asientos[k]==1) 
				{
					if (k<10) 
					{
						System.out.print(" "+k+" - ");
					} else {
						System.out.print(k+" - ");
					}
				}
				if (asientos[k]==0) 
				{
					System.out.print("XX - ");
				}
				k = k+1;
			}
			System.out.println("");
		}
	}
	
}
