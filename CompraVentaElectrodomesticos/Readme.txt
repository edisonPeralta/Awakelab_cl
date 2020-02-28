Ejercicio de Creación de electrodomesticos

   En este ejercicio nos solicitaban realizar una clase padre llamada Electrodomesticos y dos clases hijas llamadas Lavadora 
y Television respectivamente, ademas de su ejecutable. La clase padre debia contener valores constantes con los cuales
llenariamos los respectivos Objetos en el caso de que estos fuesen distintos a los solicitados o simplemente se omitieran.

	Para solucionar este problema comence por crear las clases con sus respectivas variables y metodos, ademas de sus
constructores los cuales serian los que usariamos para cada clase hija mas adelante.
	Al momento de comenzar a solucionar los metodos note el problema que las constantes debian tener una variable auxiliar
las cuales deberian captar los valores de los Objetos para poder utilizarlos en los metodos y poder devolver un valor valido ya
que al querer resolver cada problematica de los metodos con los valores constantes estos no cambiarian nunca para dar el 
resultado esperado.

	Al finalizar todas las clases y comenzar a desarrollar el ejecutable de este proyecto arrojo un error, para este error
se dio por querer utilizar las constantes dentro de los constructores, se procedio a cambiar los constructores por las variables
auxiliares y este se soluciono, ademas se investigar como funcionaba el Operador 'instanceof' para poder utilizarlo en un for
creado para recorrer los arreglos y asignar cada valor solicitado a su respectiva variable de suma dependiendo de su clase.