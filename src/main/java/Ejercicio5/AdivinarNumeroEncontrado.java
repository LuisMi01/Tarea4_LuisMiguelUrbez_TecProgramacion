package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class AdivinarNumeroEncontrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un numero del 1-100 y presione cualquier tecla para continuar");
        int numeroUsuario = teclado.nextInt();
        int numMaquina =  (int) (Math.random() * (100 + 1));

        ArrayList<Integer> lista = new ArrayList<Integer>();

        while(numMaquina != numeroUsuario){
            numMaquina = (int) (Math.random() * (100 + 1));
            System.out.println("Pruebo con el " + numMaquina + "¿es mayor, menor o igual (+/-/=)?" );
            String respuesta = teclado.next();

            if(respuesta.equals("+")){
                if(numMaquina > numeroUsuario){
                    System.out.println("No es mayor");
                    lista.add(numMaquina);
                }
            }else if(respuesta.equals("-")){
                if(numMaquina < numeroUsuario){
                    System.out.println("No es menor");
                    lista.add(numMaquina);

                }
            }else if(respuesta.equals("=")){
                if(numMaquina == numeroUsuario){
                    System.out.println("Es igual");

                    double suma = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        suma = suma + lista.get(i);
                    }
                    double media = suma;

                    System.out.println("Lo has encontrado en " + media + " intentos");

                }
            }
        }


    }
}
