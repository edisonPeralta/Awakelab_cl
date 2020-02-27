package Oscurilandia;

import java.util.*;

public class Tablero {
	
		int Carro [][];
		int huevo[][];
		
		public Tablero() {
			
		}

		public Tablero(int[][] carro, int[][] huevo) {
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

		}
		
		public void mostrarTablero(int largo, int ancho){
			
		int i;
		int p;
			
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
	
	public void lanzarHuevo() {
		
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
		
		int[][] aux =new int [16][18];
		for(int i = 0; i<16;i++) 
		{
			for(int j=0;j<18;j++)
			{
				aux[i][j]=tableroM[i][j];
			}
		}
		
		Scanner read = new Scanner(System.in);
		int total=0;
		int numeroA=0;
		int numeroB=1;
		int z;
		
		int[][] tablero =new int [16][18];
		for(int i = 0; i<16;i++) 
		{
			for(int j=0;j<18;j++)
			{
				tablero[i][j]=0;
			}
		}
		
		while (numeroA+numeroB > 0) {
			
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
			
			System.out.println(" ");
			System.out.println("==============================");
			System.out.println("Su Puntaje actual es: "+total);
			System.out.println("==============================");
			System.out.println(" ");
			System.out.println("Usted esta jugando 'Oscurilandia' para salir digite 0 en horizontal y vertical");
			System.out.println(" ");
			System.out.println("Elija un numero orizontal");
			z = read.nextInt();
			numeroA = z;
			
			System.out.println("Elija un numero vertical");
			z = read.nextInt();
			numeroB = z;
			
			if (numeroA>=0 && numeroA<16 && numeroB>=0 && numeroB<16) {
				if (numeroA!=0 | numeroB!=0)	{
			
					tablero[numeroB][numeroA+1]=1; 
					System.out.println("Huevo lanzado con exito!!");
					System.out.println("");
			
				}
			
				//Sumamos Valor de las "TRUPALLAS" =1PTS
				if (aux[numeroB][numeroA+1]==2) {
				
				total=total+1;
				aux[numeroB][numeroA+1]=7;
				// Asignamos un valor distinto dentro del arreglo cuando acierta un huevo para diferenciar de los que ya acerto y no sume nuevamente
				System.out.println("Acertaste una Trupalla, Ganas 1 Puntos!!!");
				System.out.println("");
				
				}
			
				//Sumamos Valor de los "CAGUANOS" =2PTS
				if (aux[numeroB][numeroA+1]==3) { 
				
					if	(aux[numeroB][(numeroA+1)+1]==5) { //Sumamos al Valor 7PTS en caso que se destruya completo el "CAGUANO"
					
						total=total+7;
						System.out.println("Destruiste un Caguano, Ganas 7 Puntos extra!!!");
						System.out.println("");
					
					}else if(aux[numeroB][numeroA]==5){ 
					
						total=total+7;
						System.out.println("Destruiste un Caguano, Ganas 7 Puntos extra!!!");
						System.out.println("");
					
					}
				
					total=total+2; 
					aux[numeroB][numeroA+1]=5;
					// Asignamos un valor distinto dentro del arreglo cuando acierta un huevo para diferenciar de los que ya acerto y no sume nuevamente
					System.out.println("Acertaste un Caguano, Ganas 2 Puntos!!!");
					System.out.println("");
				
				}
			
				//Sumamos Valor de las "KROMIS" =3PTS
				if (aux[numeroB][numeroA+1]==4) { 
				
					if (aux[numeroB+1][numeroA+1]==6 && aux[numeroB+2][numeroA+1]==6) { //Sumamos al Valor 10PTS en caso que se destruya completa la "KROMI"
					
						total=total+10;
						System.out.println("Destruiste una Kromi, Ganas 10 Puntos extra!!!");
						System.out.println("");
					
					}else if(aux[numeroB+1][numeroA+1]==6 && aux[numeroB-1][numeroA+1]==6) { 
					
						total=total+10;
						System.out.println("Destruiste una Kromi, Ganas 10 Puntos extra!!!");
						System.out.println("");
					
					}else if(aux[numeroB-1][numeroA+1]==6 && aux[numeroB-2][numeroA+1]==6){ 
					
						total=total+10;
						System.out.println("Destruiste una Kromi, Ganas 10 Puntos extra!!!");
						System.out.println("");
					
					}
				
					total=total+3;
					aux[numeroB][numeroA+1]=6;
					// Asignamos un valor distinto dentro del arreglo cuando acierta un huevo para diferenciar de los que ya acerto y no sume nuevamente
					System.out.println("Acertaste una Kromi, Ganas 3 Puntos!!!");
					System.out.println("");
								
				}
			}else {
				System.out.println("Parametros no existen.");
				System.out.println("");
			}
			
		}
		
		System.out.println(" ");
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("Su Puntaje total fue: "+total);
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println(" ");
		System.out.println("Good Bye...");	
		
		read.close();
		System.out.println(" ");
	}
}

	


	
	
	

 





