package Ejercicio10;

import java.util.Scanner;

public class ASCII1 {
    public static void main(String[] args) {
        //Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.
        //El usuario debe introducir el número de filas y el número de columnas.
        //El rectángulo debe estar relleno con el carácter que el usuario desee.
        //Por ejemplo, si el usuario introduce 3 filas, 5 columnas y el carácter ‘x’, el rectángulo debe ser:
        //xxxxx
        //xxxxx
        //xxxxx

        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        String caracter;

        System.out.println("Escriba el número de filas");
         filas = sc.nextInt();
        System.out.println("Escriba el número de columnas");
        columnas = sc.nextInt();
        System.out.println("Escriba el carácter que desea utilizar");
        caracter = sc.next();

        //Bucle
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }




    }
}
