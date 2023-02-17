package Ejercicio7;

import java.util.Scanner;

public class PeliculasV1 {
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
        System.out.println("Cita de Kill Bill:" );
        System.out.println("Lo que me falta es compasión, perdón y piedad, no raciocinio.\n");
    }
    public static void cita2() {
        System.out.println("Cita de Stars Wars:");
        System.out.println("Que la fuerza te acompañe.\n");
    }public static void cita3() {
        System.out.println("Cita de Por un puñado de dólares:");
        System.out.println("El dinero hace apreciar la paz.\n");
    }public static void cita4() {
        System.out.println("Cita de Scarface:");
        System.out.println("Todo lo que tengo en esta vida son mis cojones y mi palabra, y no las rompo por nadie. ¿Me entiendes?\n");
    }
}
