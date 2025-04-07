

package javaselectivasd;

import java.util.Scanner;


public class JavaSelectivasD {

    //solicitar una letra e imprimir si es vocal o no

    public static void main(String[] args) {
        

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Brindame una letra por favor ");
        char letra = teclado.next().charAt(0);
        
        switch(letra) {
            case 'a', 'e', 'i', 'o', 'u' : System.out.println("Es vocal");
            break;
            default: System.out.println("Es consonante");
        
        }
        
        
        
    }
    
}
