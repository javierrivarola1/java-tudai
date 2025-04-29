
package ejercicioiterativas1;

import java.util.Scanner;


public class EjercicioIterativas1 {


    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Por favor dame un número: ");
        num = teclado.nextInt();
        
        while (num < 100 && num > 1) {
        
            if (num % 2 == 0 && num % 3 == 0){
                System.out.println("Son multiplos de 2 y 3 los numenos " + num);
                
            } else {System.out.println("No son multiplos");
            
            }   System.out.print("Ingresa otro número: ");
                num = teclado.nextInt();
               
        }
        
        
    }
    
}
