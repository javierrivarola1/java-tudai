
package primerejercicioarrays;

import java.util.Scanner;

public class PrimerEjercicioArrays {

    public static final int MAX = 15;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int array[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Dame numeros que vayan entre el 1 y el 12 ");
            int numLimite = teclado.nextInt();
            while (numLimite<1 || numLimite>12) {
                System.out.println("Necesito por favor que me des un numero entre el 1 y el 12");
                numLimite = teclado.nextInt();
            }
            array[i] = numLimite;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Los numeros son: " + array[j]);
        }

    }

}
