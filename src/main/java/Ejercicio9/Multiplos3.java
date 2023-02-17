package Ejercicio9;

import java.util.Scanner;

public class Multiplos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Escriba un número múltiplo de 3");
        numero = sc.nextInt();

        //Bucle
        while (numero % 3 != 0) {
            System.out.println("El número no es múltiplo de 3, escriba otro");
            numero = Integer.parseInt(System.console().readLine());
        }
    }
}
