package ejercicioconarrays_1;

import java.util.Scanner;

public class EjercicioconArrays_1 {

    public static void main(String[] args) {

        int arr[] = new int[8];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Dame un numero por favor que este entre el 1 y el 12: ");
            int valor = teclado.nextInt();
            while (valor < 1 || valor > 12) {
                System.out.println("Valor invalido, vuelva a poner otro valor: ");
                valor = teclado.nextInt();

            }

            arr[i] = valor;

        }

        for (int j = 0; j < 8; j++) {
            System.out.println("Los resultados son: " + arr[j]);
        }

    }

}
