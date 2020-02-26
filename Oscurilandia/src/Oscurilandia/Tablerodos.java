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
		
		public void crearCarro() {
//			Carro objCarro[] = new Carro[18];
		}
		
	public void mostrarTablero(int largo, int ancho){
		
		int[][] tableroM =new int [16][18];
		for(int i = 0; i<16;i++) 
		{
			for(int j=0;j<18;j++)
			{
				tableroM[i][j]=0;
			}
		}
		
		Carro objCarro[] = new Carro[18];
		
		int indice=0;
		while(indice<18) {
			
			int i;
			for (i=0;i<10;i++) {
				int cantOcup= (int)(Math.random()*5);
				int annoIngreso= (int)(Math.random()*5+2014);
				int ubicX= (int)(Math.random()*14+1);
				int ubicY= (int)(Math.random()*14+1);
				int nivelArmad= (int)(Math.random()*5);
				int cop= 1;
				objCarro[i]= new Trupalla (cantOcup, "Año "+String.valueOf(annoIngreso), ubicX, ubicY, nivelArmad, "Cop "+String.valueOf(cop));
				cop++;
				if(tableroM[ubicX][ubicY+1]==0) {
					tableroM[ubicX][ubicY+1]=2;
					indice++;
				}else {
					i--;
				}
			}
		
			for (i=10;i<15;i++) {
				int cantOcup= (int)(Math.random()*5);
				int annoIngreso= (int)(Math.random()*5+2014);
				int ubicX= (int)(Math.random()*14+1);
				int ubicY= (int)(Math.random()*13+1);
				int alcTiro= (int)(Math.random()*5);
				int cop= 1;
				objCarro[i]= new Caguano (cantOcup, "Año "+String.valueOf(annoIngreso), ubicX, ubicY, alcTiro, "Color "+String.valueOf(cop));
				cop++;
				if(tableroM[ubicX][ubicY+1]==0 && tableroM[ubicX][(ubicY+1)+1]==0) {
					tableroM[ubicX][ubicY+1]=3;
					tableroM[ubicX][(ubicY+1)+1]=3;
					indice++;
				}else {
					i--;
				}
			}
		
			for (i=15;i<18;i++) {
				int cantOcup= (int)(Math.random()*5);
				int annoIngreso= (int)(Math.random()*5+2014);
				int ubicX= (int)(Math.random()*12+1);
				int ubicY= (int)(Math.random()*14+1);
				int anno= (int)(Math.random()*10+2000);
				int cop= 1;
				objCarro[i]= new Kromi (cantOcup, "Año "+String.valueOf(annoIngreso), ubicX, ubicY, anno, String.valueOf(cop));
				cop++;
				if(tableroM[ubicX][ubicY+1]==0 && tableroM[ubicX+1][ubicY+1]==0 && tableroM[ubicX+2][ubicY+1]==0) {
					tableroM[ubicX][ubicY+1]=4;
					tableroM[ubicX+1][ubicY+1]=4;
					tableroM[ubicX+2][ubicY+1]=4;
					indice++;
				}else {
					i--;
				}
			}
		}
		
		int i;
		int p;
		for (i=1;i<16;i++) {			
			   
			if ((i==1) && (i<16)){				
				System.out.println("     1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");    				
			}
			
			System.out.println(" ______________________________________________________________");	
			
			for (p=1;p<18;p++) {	
				
				if (tableroM[i][p]==2) {
					
					if (p==18) {				
						System.out.print("| T |");					
					}else if((p==1) && (i<10)){						
						System.out.print(" "+i);
					}else if((p==1) && (i>9 && i<16)){
						System.out.print(i);
					}else {						
						System.out.print(" | T");
					}					
						
				}else
					
				if (tableroM[i][p]==3) {
						
					if (p==18) {				
						System.out.print("| C |");					
					}else if((p==1) && (i<10)){						
						System.out.print(" "+i);
					}else if((p==1) && (i>9 && i<16)){
						System.out.print(i);
					}else {						
						System.out.print(" | C");
					}					
							
				}else
					
				if (tableroM[i][p]==4) {
						
					if (p==18) {				
						System.out.print("| K |");					
					}else if((p==1) && (i<10)){						
						System.out.print(" "+i);
					}else if((p==1) && (i>9 && i<16)){
						System.out.print(i);
					}else {						
						System.out.print(" | K");
					}					
								
				}else
					
				if (tableroM[i][p]==1) {
					
					if (p==18) {				
						System.out.print("| H |");					
					}else if((p==1) && (i<10)){						
						System.out.print(" "+i);
					}else if((p==1) && (i>9 && i<16)){
						System.out.print(i);
					}else {						
						System.out.print(" | H");
					}					
					
				}else
					
				if (p==18) {				
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
			
/*
 * 		int largo=16;
//		int ancho=18;
		int i;
		int p;
	
//		int tablero[][] = new int[largo][ancho];{			
			for (i=1;i<16;i++) {
				
				if ((i==1) && (i<16)){			
					System.out.println					
					("    1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");    				
				}
				
				System.out.println(" ______________________________________________________________");
				
				
				for (p=1;p<18;p++) {						
						
					if (p==18) {				
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
	} 
*/
	
	}	  
	
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
		
		do {
			
			int i;
			int p;
			for (i=1;i<16;i++) {			
				   
				if ((i==1) && (i<16)){				
					System.out.println("     1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");    				
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
				
//				huevo.add(numeroB, numeroA+1);
			
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

	


	
	
	

 





