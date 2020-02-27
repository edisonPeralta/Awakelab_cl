Ejercicio "Oscurilandia"
Integrantes: Javiera Vásquez
	     Edison Peralta.

Este ejercicio nos proponía hacer un tablero de coordenadas, ubicando objetos ("Kromis", "Caguanos" y "Trupallas")
 de manera aleatoria, reemplazar su valor con otro objeto(Huevos) con coordenadas ingresadas por teclado, y adicionarle 
un puntaje acorde al respectivo reemplazo.

Para esto hemos hecho una clase para cada objeto, con una superclase llamada Carro que entregaba datos a las Kromis,
Caguanos y Trupallas. Hicimos una clase llamada tablero que llamaba a los atributos de cada clase y arreglos
 bidimencionales para cada objeto de su respectiva clase, para así poder ubicarlos en el tablero. 
Para poder darle una ubicación aleatoria al arrego de Carros (que contiene los arreglos de Kromis, Caguanos y Trupallas)
utilizamos el método Math random para darle el primer posicionamiento y comparamos cada arreglo para que no se sobreescribiera
el valor.
Para posicionar los huevos,ingresamos una posición del array tablero por teclado, recorremos el array, reemplazamos su valor
y lo comparamos con el array de Carros para verificar si le dio a algún carro, el usuario podrá terminar el juego
en cualquier momento, al no tener una cantidad determinada de huevos, se despliega un menú cada vez que lanza un huevo
que pregunta si desea continuar.

Posteriormente le añadimos puntaje a cada Huevo (iniciando un contador) que reemplaza un Carro
(incrementandose si se hunde el carro completo) , y un Puntaje total, sumando todos los puntajes.

y todo esto lo añadimos en un método main para poder ejecutarlo, dentro del main desplegamos un menú
que llama a la clase tablero (a través de un void) si deseamos jugar y y un mensaje de adiós si no queremos jugar.


