
package ejerciciosdesentencia3;

import java.util.Scanner;


public class EjerciciosdeSentencia3 {


    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     
     int num;
     
        System.out.println("Por favor dame un numero :");
        num = teclado.nextInt();
        
        if (num > 50) {
            if (num % 2 == 0 && num % 3 ==0) {
                System.out.println("Este numero pasa por pantalla: " + num);
            
            } else { 
                System.out.println("No es multiplo de 3 y de 2");}
        } else { 
            System.out.println("No es mayor a 50");
        }        
    }
    
}
