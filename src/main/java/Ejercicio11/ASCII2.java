package Ejercicio11;

import java.util.Scanner;

public class ASCII2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rombo");
            System.out.println("4. Salir");
            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuadrado");
                    cuadrado();
                    break;
                case 2:
                    System.out.println("Triangulo");
                    triangulo();
                    break;
                case 3:
                    System.out.println("Rombo");
                    rombo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

    public static void cuadrado() {
        int numero;
        System.out.println("Escriba un número");
        numero = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangulo() {
        int numero;
        System.out.println("Escriba un número");
        numero = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rombo() {
        int numero;
        System.out.println("Escriba un número");
        numero = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numero; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
