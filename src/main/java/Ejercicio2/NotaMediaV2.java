package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaMediaV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> notasCantidad = new ArrayList<>();
        double nota = 0;

        if (nota != -1) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce la nota " + (i+1));
                nota = teclado.nextDouble();
                notasCantidad.add(nota);
            }
        } else {
            double suma = 0;
            for (int i = 0; i < notasCantidad.size(); i++) {
                suma = suma + notasCantidad.get(i);
            }
            double media = suma / notasCantidad.size();
            System.out.println("La media de las notas es: " + media);
        }

    }
}
