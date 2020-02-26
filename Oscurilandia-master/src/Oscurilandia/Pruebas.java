package Oscurilandia;

public class Pruebas {

public void mostrarTablero(){
		
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
			
		//	int i;
		//	for (i=0;i<10;i++) {
			/*	int cantOcup= (int)(Math.random()*5);
				int annoIngreso= (int)(Math.random()*5+2014);
				int ubicX= (int)(Math.random()*15);
				int ubicY= (int)(Math.random()*15);
				int nivelArmad= (int)(Math.random()*5);
				int cop= 1;
				objCarro[i]= new Trupalla (cantOcup, "Año "+String.valueOf(annoIngreso), ubicX, ubicY, nivelArmad, "Cop "+String.valueOf(cop));
				cop++;*/
			int ubicX= 1;
			int ubicY= 1;
			objCarro[0]= new Trupalla (2, "Año "+String.valueOf(2014), ubicX, ubicY, 3, "Cop "+String.valueOf(2));
				if(tableroM[ubicX][ubicY]==0) {
					tableroM[ubicX][ubicY]=2;
					indice++;
				}//else {
			//		i--;
			//	}
			}
			
			int i;
			int p;
			for (i=1;i<16;i++) {
				
			}
				   
				if ((i==1) && (i<16)){				
					System.out.println					
					("     1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");    				
				}
				
				System.out.println(" ______________________________________________________________");	
				
				for (p=1;p<18;p++) {	
					
					if (tableroM[i][p]==2) {
						
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
}
