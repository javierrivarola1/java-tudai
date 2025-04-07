
package javacondiciones2;

import java.util.Scanner;


public class JavaCondiciones2 {


    public static void main(String[] args) {
  
        int num;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ahora si pasame tu edad a ver: ");
        
        num = teclado.nextInt();
        
        if (num >= 18 ) {
        
            System.out.println("Podes entrar a nuestro evento");
            
            if (num >= 65) {
            
                System.out.println("Tenes un descuento por ser jubilado");
                
            }           
        }  else {
                    System.out.println("No entras, ya te lo dijimos");
            }
    }
    
}
