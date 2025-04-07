
package ejerciciocondiociones1;

import java.util.Scanner;


public class EjercicioCondiociones1 {


    public static void main(String[] args) {
      int edad;
      
      Scanner teclado = new Scanner (System.in);
      
        System.out.println("Por favor me decís tu edad: ");
       
        edad = teclado.nextInt();
        
        if (edad > 18) {
            System.out.println("Podes entrar al boliche");
        }
        else {          
            if (edad == 18) {
                System.out.println("Lo lamento pero hoy no hay entradas gratis, podes pasar");
            } else {
                System.out.println("No entras al boliche, me entendiste?");
            
            }
        
        } 
                       
    }
    
}
