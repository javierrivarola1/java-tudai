/*
EL EJERCICIO TRES NO SE PUEDE HACER YA QUE CUANDO UNO PIDE DATOS Y TIENE QUE 
GUARDARLO EN UNA VARIABLE, NO EN UNA CONSTANTE YA QUE SABEMOS QUE LA CONSTANTE
NO SE LE PUEDE CAMBIAR EL VALOR UNA VEZ YA HECHO

EN EL EJERCICIO 4 HAY QUE PEDIR 5 VALORES CON EL FORMATO DE NÚMERO ENTERO (INT)
, PASARLOS POR UTILS.LEERINT Y MOSTRARLOS EN PANTALLA CON SYSTEM.OUT


 */


     
package ejerciciocinco;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjercicioCinco {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   
        System.out.println("Ingrese 5 números:");
        System.out.println("Número 1: ");
        String num1 = reader.readLine();
        System.out.println("Número 2: ");
        String num2 = reader.readLine();
        System.out.println("Número 3: ");
        String num3 = reader.readLine();
        System.out.println("Número 4: ");
        String num4 = reader.readLine();
        System.out.println("Número 5: ");
        String num5 = reader.readLine();

        
        System.out.println("Los números en orden inverso son:");
        System.out.println(num5 + " " + num4 + " " + num3 + " " + num2 + " " + num1);
    }
}

