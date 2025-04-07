
package ejercicioocho;

import java.util.Scanner;


public class EjercicioOcho {

  
    public static void main(String[] args) {
        
       boolean verdadero;
       boolean falso;
       
       Scanner teclado = new Scanner (System.in);
      
        
        System.out.println("Dame tu primer verdadero o falso: ");
         verdadero = teclado.nextBoolean();
         
         System.out.println("Dame ahora tu segundo verdadero o falso: ");
         falso = teclado.nextBoolean();
         
         System.out.println("false or true es: " + (verdadero || falso));
         System.out.println("true or false es " + ( verdadero || falso ));
         System.out.println("false or false es: " + (falso || falso));
         System.out.println("true or true: " + (verdadero || verdadero));
         System.out.println("true and false es: " + (verdadero && falso));
         System.out.println("false and true es: " + (falso && verdadero));
         System.out.println("false and false es : " + (falso && falso));
         System.out.println("false and false es : " + (verdadero && verdadero));
        
    }
    
}
