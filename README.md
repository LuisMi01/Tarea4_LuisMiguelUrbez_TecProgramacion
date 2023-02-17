# Tarea4_LuisMiguelUrbez_TecProgramacion

# Ejercicios
## 1. La nota media (versión 1)
   Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.

A continuación se muestra un ejemplo de posibles visualizaciones y valores introducidos, durante una ejecución del algoritmo (los valores introducidos por el usuario, están escritos en negrita y cursiva):

Introduzca el número de notas:

3

Nota:

12

Nota:

17,5

Nota:

14

La media es 14,5

## 2. La nota media (versión 2)
   El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.

Ejemplo de ejecución del algoritmo:

¿Nota (-1 para terminar)?

9

¿Nota (-1 para terminar)?

18

¿Nota (-1 para terminar)?

-1

La nota media es 13,5

## 3. La nota media (versión 3)
   Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.

Ejemplo de ejecución del algoritmo:

¿Nota (-1 para terminar)?

14

¿Nota (-1 para terminar)?

12

¿Nota (-1 para terminar)?

9

¿Nota (-1 para terminar)?

7

¿Nota (-1 para terminar)?

10

¿Nota (-1 para terminar)?

-1

Media = 10,4 (60 % ≥10)

## 4. Adivine en qué número estoy pensando
   Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.

Ejemplo de ejecución del algoritmo:

¿En qué número entre 1 y 100 estoy pensando?

23

Menor

15

Mayor

19

Menor

17

Bravo, lo ha encontrado

## 5. Ahora tengo que encontrarlo yo
   Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.

a

Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?

-

Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?

=

Fenomenal, lo he encontrado después de 4 intentos.

## 6. ¿Qué hace este algoritmo?
   Observe atentamente el siguiente algoritmo:

Algo Trampa  
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0
escribir("Respuesta incorrecta")  
escribir("Solo quedan " & MAX_INTENTOS - numIntentos &  
" intento(s)")  
valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
FMq  
Si MAX_INTENTOS - numIntento ≠ 0 Entonces  
escribir("Bravo")  
Si no  
escribir("Revise sus conocimientos en geografía")  
FSi  
Fin
¿Qué hace?

Corrija este algoritmo para que logre lo que se podría esperar.

## 7. Visualización de citas de películas (versión 1)
   El programa debe mostrar un menú con una lista de películas y una opción para salir.

Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.

Si el usuario elige salir, el programa mostrará un mensaje antes de salir.

Ejemplo de ejecución:

1 - Una cita de la ciudad del miedo

2 - Una cita de James Bond

3 - Una cita de la vida es un largo río tranquilo

4 - Una cita de Star Wars

5 - Salir de esta magnífica aplicación

2

Me llamo Bond, James Bond

1

Cuidado, es una auténtica carnicería

5

Adios

¡Por supuesto, puede elegir las películas y las citas que prefiera!

## 8. Visualización de citas de películas (versión 2)
   Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.

## 9. Escribir un múltiplo de tres
   Escriba un programa que haga que el usuario escriba un múltiplo de tres y no se detenga hasta que el número sea correcto.

Ejemplo de ejecución del algoritmo:

Escriba un múltiplo de 3

7579

Error 7579 no es un múltiplo de 3

16427

Error 16427 no es un múltiplo de 3

51321

Ok: 51321 es un múltiplo de 3

## 10. Arte ASCII 1
    El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente.

Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.

Ejemplo de ejecución:

¿Anchura?

8

¿Altura?

5

¿Carácter?

#

########

########

########

########

########

## 11. Arte ASCII 2
    Dibujar una de las siguientes formas, según la elección del usuario:

Images/04RI04.png
Ejemplo de ejecución:

¿tamaño?

5

¿Carácter?

#

¿forma?

1 - rectángulo con relleno

2 - rectángulo sin relleno

3 - cruz de San Andrés

4 - triángulo rectángulo

5 - rombo

6 - ajedrezado

2

Images/04RI05.png
Observe que el número de líneas es igual al número de columnas.