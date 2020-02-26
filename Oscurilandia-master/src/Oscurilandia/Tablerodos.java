package Oscurilandia;

import java.util.*;
public class Tablerodos {
	
		int Carro [][];
		int huevo[][];
		
		
		public Tablerodos() {
			
		}

		public Tablerodos(int[][] carro, int[][] huevo) {
			super();
			Carro = carro;
			this.huevo = huevo;
		}

		public int[][] getCarro() {
			return Carro;
		}

		public void setCarro(int[][] carro) {
			Carro = carro;
		}

		public int[][] getHuevo() {
			return huevo;
		}

		public void setHuevo(int[][] huevo) {
			this.huevo = huevo;
		}

		public String toString() {
			return "Tablero [Carro=" + Arrays.toString(Carro) + ", huevo=" + Arrays.toString(huevo) + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		public int crearCarro() {
			return 0;
		}
		
	public void mostrartablero1(int largo, int ancho){
		
//	int largo=16;
//	int ancho=18;
	int i;
	int p;
	
	//int tablero[][] = new int[largo][ancho];{
			
			for (i=1;i<16;i++) {			
				   
				if ((i==1) && (i<16)){
				
					System.out.println
					
					("    1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");
    				
				}
				
				System.out.println(" ______________________________________________________________");
				
				
				for (p=1;p<18;p++) {				
						
						
						if (p==18) {
				
							System.out.print("|   |");					
						}
					
						else if((p==1) && (i<10)){
						
							System.out.print(" "+i);
						}
						
						else if((p==1) && (i>9 && i<16)){
						    System.out.print(i);
						}
						else {
						
							System.out.print(" |  ");
						}
							
					}
					
					System.out.println("");
				}
				System.out.println(" ______________________________________________________________"); 
	}		
	//}	
	public void lanzarHuevo() {
		
		Scanner read = new Scanner(System.in);
		int a=0;
		int numeroA;
		int numeroB;
		int z;
		
		int[][] tablero =new int [16][18];
		for(int i = 0; i<16;i++) 
		{
			for(int j=0;j<18;j++)
			{
				tablero[i][j]=0;
			}
		}
		
//		ArrayList huevo= new Arraylist();
		
		do {
			
			int i;
			int p;
			for (i=1;i<16;i++) {			
				   
				if ((i==1) && (i<16)){				
					System.out.println					
					("     1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");    				
				}
				
				System.out.println(" ______________________________________________________________");				
				
				for (p=1;p<18;p++) {			
						
					if (tablero[i][p]==1) {
						if (p==18) {				
							System.out.print("| H |");					
						}else if((p==1) && (i<10)){						
							System.out.print(" "+i);
						}else if((p==1) && (i>9 && i<16)){
							System.out.print(i);
						}else {						
							System.out.print(" | H");
						}
					}else if (p==18) {				
						System.out.print("|   |");					
					}else if((p==1) && (i<10)){						
						System.out.print(" "+i);
					}else if((p==1) && (i>9 && i<16)){
						System.out.print(i);
					}else {						
						System.out.print(" |  ");
					}
							
				}
					
				System.out.println("");
			}
			
			System.out.println(" ______________________________________________________________"); 
			
			System.out.println("Usted esta jugando 'Oscurilandia' para salir digite 0 en horizontal y vertical");
			System.out.println(" ");
			System.out.println("Elija un numero orizontal");
			z = read.nextInt();
			numeroA = z;
			
			System.out.println("Elija un numero vertical");
			z = read.nextInt();
			numeroB = z;
			
			if (numeroA!=0 | numeroB!=0)	{	
				
//				huevo.add(numeroA, numeroB);
			
				tablero[numeroB][numeroA+1]=1; 
				System.out.println("Exito!!");
				System.out.println("");
			
			}
			
		}while (numeroA+numeroB != 0);
			
		System.out.println("Good Bye...");	
//				for (int i = 0; i < z; i++){	
//					    if(i==0) {
//					    	System.out.println("tu huevo se estrelló en el suelo :(");
//					    }
//					    if(i==1) {
//						    System.out.println("le achuntaste ");
//						}
//					}

//		int[][]C =new int[16][18]; 
		
//		for(int f = 0; f<16;f++) 
//		{
//			for(int j=0;j<18;j++)
//			{
//				C[f][j]=0; 
//			}
//			}	
		
		read.close();
	}
}

	


	
	
	

 





