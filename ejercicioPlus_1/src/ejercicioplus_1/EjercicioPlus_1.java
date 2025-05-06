
package ejercicioplus_1;

import java.util.Scanner;


public class EjercicioPlus_1 {


    public static void main(String[] args) {

            
        int puntajeJugador = jugador();

        if (puntajeJugador > 21) {

            System.out.println("Perdiste el juego");

        } else {
            
            int puntajeMaquina = maquina();

            if (puntajeMaquina > 21) {

                System.out.println("Quede afuera, me parezco a Francia ");
            } else {
                if (puntajeMaquina > puntajeJugador) {

                    System.out.println("Gano la banca");

                } else {
                    System.out.println("Ganaste el juego");
                }
            }
        }

    }
    public static int jugador() {
    
         int jugador = 0;
        boolean cortar = false;
        int aceptar = 1;

        Scanner teclado = new Scanner(System.in);

        while (jugador < 21 && !cortar) {

            System.out.println("Si queres una carta decime 1 si no decime 0 ?");
            aceptar = teclado.nextInt();

            if (aceptar == 0) {
                cortar = true;
            } else {
                int carta = (int) (Math.random() * 10) + 1;

                jugador = jugador + carta;

                System.out.println("Tu carta es: " + carta
                        + " y llevas sumando " + jugador);

            }
        }
    
    return jugador; } ;
    
    public static int maquina() {
    
                int maquina = 0;

            while (maquina <= 16) {

                int carta = (int) (Math.random() * 10) + 1;

                maquina = maquina + carta;

                System.out.println("Tu carta es " + carta + " y tu resultado es "
                        + maquina);
            }
        
    return maquina;};
}
