package Ejercicio8;

import java.util.Scanner;

public class PeliculasV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Pelicula 1");
            System.out.println("2. Pelicula 2");
            System.out.println("3. Pelicula 3");
            System.out.println("4. Pelicula 4");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Kill Bill");
                    cita1();
                    break;
                case 2:
                    System.out.println("Stars Wars");
                    cita2();
                    break;
                case 3:
                    System.out.println("Por un puñado de dólares");
                    cita3();
                    break;
                case 4:
                    System.out.println("Scarface");
                    cita4();
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    public static void cita1() {
        int numero;
        numero = (int) (Math.random() * 2) + 1;
        if (numero == 1) {
            System.out.println("Cita de Kill Bill:" );
            System.out.println("Lo que me falta es compasión, perdón y piedad, no raciocinio.\n");
        } else {
            System.out.println("Cita de Kill Bill:" );
             System.out.println("La venganza nunca es un camino recto. Es como un bosque, y es fácil perderse..\n");
        }
   }
    public static void cita2() {
        int numero;
        numero = (int) (Math.random() * 2) + 1;
        if (numero == 1) {
            System.out.println("Cita de Star Wars:" );
            System.out.println("Que la fuerza te acompañe.\n");
        } else {
            System.out.println("Cita de Star Wars:" );
            System.out.println("yo soy tu padre\n");
        }
    }public static void cita3() {

        int numero;
        numero = (int) (Math.random() * 2) + 1;
        if (numero == 1) {
            System.out.println("Cita de Por un puñado de dólares:" );
            System.out.println("El dinero hace apreciar la paz.\n");
        } else {
            System.out.println("Cita de Por un puñado de dólares:" );
            System.out.println("Los rojo a un lado, los buster al otro, y yo en medio.\n");
        }
    }public static void cita4() {
        int numero;
        numero = (int) (Math.random() * 2) + 1;
        if (numero == 1) {
            System.out.println("Cita de Scarface:" );
            System.out.println("Todo lo que tengo en esta vida son mis cojones y mi palabra, y no las rompo por nadie. ¿Me entiendes?\n");
        } else {
            System.out.println("Cita de Scarface:" );
            System.out.println("¿Qué es la vida? Una enfermedad mortal.\n");
        }
    }
}


