package Ejercicio4;

import java.util.Scanner;

public class AdivinarNumeroPensando {
    public static void main(String[] args) {
        int numeroRandom = (int) (Math.random() * (100 + 1));
        System.out.println("¿En que numero estoy pensando? (Entre el 1 y el 100)");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while (numero != numeroRandom) {
            if (numero > numeroRandom) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }
            numero = sc.nextInt();
        }
    }
}
