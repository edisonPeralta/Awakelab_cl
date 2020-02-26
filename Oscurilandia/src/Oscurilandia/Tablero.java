package Oscurilandia;
import java.util.Scanner;
public class Tablero{

	//crea una subclase de la clase Carro y 	la asigna a la lista respectiva
//Las coordenadas del carro se calculan de forma aleatoria, y no se puede traslapar un carro con otro.
public void crearCarro(){
		
	}

//crea una instancia de la clase “Huevo”, solicita la coordenada de lanzamiento, 
//asigna el puntaje al movimiento y la almacena en el listado correspondiente.



public static void lanzarHuevo() {
	
	Scanner lector = new Scanner(System.in);
	int cont = 1;
	int puntaje= 0;
	int huevosPorTirar=18;
	int[][]arrayHuevos=new int[15][15]; // Se crea un arreglo bidimensional huevos.
	String []arrayListadoLanzamientos=new String [18];
		for(int i = 0; i<15;i++) 
		{
			for(int j=0;j<15;j++)
			{
				arrayHuevos[i][j]=0; // Se rellena el array con 0s
			}
		}
	
		while(cont<huevosPorTirar+1) {
				System.out.println("Ingresa las coordenadas para lanzar tu  huevo numero " +cont+" de 18");
				System.out.println("Puntaje actual:"+puntaje);
				System.out.println("=====================================");
				System.out.println("Ingrese el numero de la columna a atacar (1-15)");
					int x = (lector.nextInt()-1 );
				System.out.println("Ingrese el numero de la fila a atacar (1-15)");
					int y = (lector.nextInt()-1 );
	
					if(arrayHuevos[x][y]==0) // si las coordenadas ingresadas == 0, entonces...
					{
						arrayHuevos[x][y]=1; 
						System.out.println("Huevo lanzado con fuerza!");
						System.out.println("");
						arrayListadoLanzamientos[cont-1] = "Huevo lanzado en la columna: "+x+"y fila: "+y;
						cont++;					
					}
					else { // si las coordenadas no son = 0
						System.out.println("Esa casilla ya fue atacada con  un huevo!");	
					}
							if(cont == (huevosPorTirar/2))
							{
							System.out.println("Vamos! ya llevas la mitad de tus huevos!");
							}
							
					if(K[x][y]==1) { // Si el huevo golpea una Kromi = 3 puntos, kill=10
						System.out.println("Has golpeado una kromi!");
						puntaje= puntaje + 3;
					}
						
					if(C[x][y]==1) {// Si el huevo golpea un Caguano= 2 puntos kill=7
						System.out.println("Has golpeado un Caguano!");
						puntaje= puntaje + 2;
					}
						
					if(T[x][y]==1) {// si el huevo golpea una Trupalla =1 punto
						System.out.println("Tu huevo ha matado a una Trupalla!");
						puntaje= puntaje + 1;
					}
		
		}//fin del while
}// fin del metodo huevo



//este método debe mostrar en forma de matriz cada uno de los carros existentes, 
//y los lanzamientos que se han registrado hasta el momento.
public static void mostrarMatriz(){
	//ARREGLO KROMIS
	int[][]K=new int[15][15]; // Se crea una matriz bidimensional "K" de 15x15, esta funcionará para registrar las Kromis.
	for(int i = 0; i<15;i++) 
	{
		for(int j=0;j<15;j++)
		{
			K[i][j]=0; // Se llena la matriz con 0, de tal forma de poder diferenciar las casillas ocupadas y vacias.
		}
	}
	//ARREGLO COGUANO
	int[][]C=new int[15][15]; //Se crea una segunda matriz bidimensional "C" esta registrará los Coguanos
	for(int i = 0; i<15;i++) 
	{
		for(int j=0;j<15;j++)
		{
			C[i][j]=0;//Se llena la matriz con 0, de tal forma de poder diferenciar las casillas ocupadas y vacias.
		}
	}
	//ARREGLO TRUPALLA
	int[][]T=new int[15][15];//Se crea una matriz bidimensional "T" de 15x15, esta funcionará para registrar los Trupallas..
	for(int i = 0; i<15;i++) 
	{
		for(int j=0;j<15;j++)
		{
			T[i][j]=0;// Se llena la matriz con 0, de tal forma de poder diferenciar las casillas ocupadas y vacias.
		}
	}
	int cont=0;
	while(cont<11) // CONTADOR DE PATRULLAS
		// cont<11 porque luego de crear 10 patrulleros, se sigue con el codigo 
	{
		int f=14; // se asigna f y c para limitar las casillas en las cuales los patrulleros pueden registrarse.
		int c=14;
		int x=(int)(Math.random()*f); // se le asigna un valor a x,  toma el valor random con maximo 14.
		int y=(int)(Math.random()*c);// se le asigna un valor a y,  toma el valor random con maximo 14.
		if(T[x][y]==0) // de haber un espacio vacio en el arreglo, en la posicion generada, se entra al IF y se asigna el valor 1
		{
		T[x][y]=1;cont++; // sumado a lo anterior, una patrulla fue asignada al tablero, por lo cual contador suma 1, (cumplir el while) 
		}
		
	}
	cont=0;
	while(cont<6) // CONTADOR DE CAGUANOS
	{
		int f=14; // f=14 para limitar la posicion en donde  CAGUANO puede generarse. al ser horizontal, puede estar en cualquier linea
		int c=13;// el caguano  al ser horizontal de 2 espacios, tiene que ser limitada hasta la columna 13. 
		int y=(int)(Math.random()*f);// se genera un valor aleatorio entre 0 y 14 para y 
		int x=(int)(Math.random()*c);// se genera un valor aleatorio entre 0 y 13 para x
		if(C[x][y]==0&&T[x][y]==0&&C[x][y+1]==0&&T[x][y+1]==0) // se valida que las coordenadas se encuentren vacias
			//se asigna un 1 SOLAMENTE si se cumplen las condiciones en la cual, no existe ningun caguano  o patrullero con las mismas coordenadas
		{
		C[x][y]=1;
		C[x][y+1]=1;// de  cumplirse, se le asigna un 1 a la casilla deseada ademas de la siguiente a la derecha. 
		cont++;//se aumenta el contador de coguanos  hasta que este tome el valor de 5. 
		}

	}
	
	cont=0;
	while(cont<4) // CONTADOR DE KROMIS
	
	{
		int f=12;// Kromi al ser vertical de 3 espacios, no puede generarse cuando y > 12 
		int c=14;// se limita la coordenada x al tamaño del tablero.
		int x=(int)(Math.random()*f);
		int y=(int)(Math.random()*c);
		if(K[x][y]==0&&C[x][y]==0&&T[x][y]==0&&K[x+1][y]==0&&C[x+1][y]==0&&T[x+1][y]==0&&K[x+2][y]==0&&C[x+2][y]==0&&T[x+2][y]==0)
			//Se valida que las coordenas generadas, sean espacios vacios en donde ningun patrullero, caguano o kromi se encuentre presente. 
		{
		K[x][y]=1;
		K[x+1][y]=1;
		K[x+2][y]=1;// se asignan las casillas siguientes como ocupadas. 
		cont++;
		}
	}
	
	
	
	
	System.out.print(" "); //salto de linea para mejor visualizacion
	
	for(int j=0; j<14;j++) 
	{
		System.out.print("____"); //borde superior del tablero
	}
	System.out.println("___");
	for(int i=0;i<15;i++)
	{
			for(int j=0; j<15;j++)
			{
				System.out.print("|   ");
			}
			System.out.println("|");
			for(int j=0; j<15;j++)
			{
				int aux=1;
				if(K[i][j]==1) 
				{ 
					System.out.print("| K ");// Pintar kromi
					aux=0;
				}
				if(T[i][j]==1)
				{
					System.out.print("| T "); // Pintar Trupalla
					aux=0;
				}
				if(C[i][j]==1)
				{
					System.out.print("| C "); //Pintar Caguano
					aux=0;
				}
				if(aux==1)
				{
					System.out.print("|   ");
				}
			}
			System.out.println("|");
		for(int j=0; j<15;j++)
		{
			System.out.print("|___");
		}
		System.out.println("|");
	}

}
	
	

	

//suma los puntajes asignados a cada lanzamiento y los entrega como resultado. 
//Este método debe ser visible solo dentro de la clase, y es utilizado en los métodos de la misma clase
public void calcularPuntaje() {
	System.out.println("El puntaje total es de:");
	
}

}