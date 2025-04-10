
package ejerciciossentencia4;

import java.util.Scanner;


public class EjerciciosSentencia4 {


    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int num;
       
        System.out.println("Ingresa un numero que vaya de 0 a 999: ");
        num = teclado.nextInt();
        
 if (num >= 100 && num <= 999) {
            System.out.println("El número tiene tres dígitos: " + num);
        } else if (num >= 10 && num <= 99) {
            System.out.println("El número tiene dos dígitos.");
        } else if (num >= 0 && num <= 9) {
            System.out.println("El número tiene un solo dígito.");
        } else {
            System.out.println("El número ingresado no cumple con el ejercicio.");
        }

    
}
    
}
