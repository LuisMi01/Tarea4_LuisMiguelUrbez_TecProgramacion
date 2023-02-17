package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaMediaV3 {

    public static void main(String[] args) {

        ArrayList<Double> notasCantidad = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las notas que quieras, para terminar introduce -1");
        double nota = teclado.nextDouble();
        while (nota != -1) {
            System.out.println("Introduce la nota ");
            notasCantidad.add(nota);
            nota = teclado.nextDouble();
        }
        double sumaNota = 0;
        for (int i = 0; i < notasCantidad.size(); i++) {
            sumaNota = sumaNota + notasCantidad.get(i);
        }
        double media = sumaNota / notasCantidad.size();
        System.out.println("La media de las notas es: " + media);
        double porcentaje = (notasCantidad.size() * 100) / 10;
        if (porcentaje < 10) {
            System.out.println("la media es más baja que 10");
        } else if (porcentaje >= 10) {
            System.out.println("El porcentaje de notas es: " + porcentaje);
        } else if (porcentaje > 20) {
            System.out.println("la media es más alta que 20");
        }
    }
}