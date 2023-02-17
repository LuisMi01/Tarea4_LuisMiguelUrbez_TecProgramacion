package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {

        ArrayList<Double> notasCantidad = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el numero de notas que quieres introducir?");
        int numNotas = teclado.nextInt();

        for (int i = 0; i < numNotas; i++) {
            System.out.println("Introduce la nota " + (i+1));
            double nota = teclado.nextDouble();
            notasCantidad.add(nota);
        }

        double suma = 0;
        for (int i = 0; i < notasCantidad.size(); i++) {
            suma = suma + notasCantidad.get(i);
        }
        double media = suma / notasCantidad.size();
        System.out.println("La media de las notas es: " + media);


    }
}
