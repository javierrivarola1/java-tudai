
package ejercicio_descendete1;

import java.util.Scanner;


public class Ejercicio_Descendete1 {


    public static void main(String[] args) {
        
        int primerNumero = pedirNumero();

        while (primerNumero !=0) {
            
            primerNumero = pedirNumero();
            /*
             int otroNum;   
            System.out.println("Brindame otro numero :");
            otroNum = pedirNumero();
            System.out.println("Tu numero es: " + otroNum);
*/
    }
        
        
        
    }
    
    public static int pedirNumero() {
        
        int num;
        Scanner teclado = new Scanner (System.in);
    
        System.out.println("Por favor dame un primer número: ");
        num = teclado.nextInt();
        
           return num;};
}
