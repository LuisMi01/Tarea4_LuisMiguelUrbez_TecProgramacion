package Ejercicio6;

import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        int numIntento = 3;
        String valorIntroducido;

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < numIntento; i++) {

            System.out.println("¿Cual es la capital de Francia?");
            valorIntroducido = teclado.nextLine();
            if (valorIntroducido.equals("Paris")) {
                System.out.println("Bravo");
            } else {
                System.out.println("Respuesta incorrecta");
                System.out.println("Solo quedan " + (numIntento) + " intentos");
                System.out.println("Revise su geografia");
            }

        }
    }
}

