
package ejerciciodeejemplobucle_if;

import java.util.Scanner;


public class EjerciciodeEjemploBucle_If {


    public static void main(String[] args) {
        
        int numeroRandom = (int) (Math.random() * 10);
        int num;
        final int intento = 5;
        int contador = 1;
        System.out.println(numeroRandom);
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Por favor brindame un numero :");
        num = teclado.nextInt();
        
        if (num == numeroRandom ) {
            System.out.println("Ganaste un pene de plastico, numero de intentos " + contador);
        } else {
            while (intento > contador && num != numeroRandom){
                System.out.println("Elige otro numero :");
                 num = teclado.nextInt();
                contador++;
            } if (numeroRandom == num) {
            System.out.println("Ganaste un pene mas chico de plastico, felicidades. En esta cantidad de intentos : " + contador + " y tu resultado fue " + numeroRandom );
            } else {
                        System.out.println("No lo lograste looser " + contador + " su numero que no adivinó fue: " + numeroRandom);

            }            
        }
    }
    
}
