
package ejercicio_prueba1refactorizado;

import java.util.Scanner;


public class Ejercicio_prueba1Refactorizado {

  
    public static void main(String[] args) {
        int num1 = pedirNum("Primer");
        int num2 = pedirNum("Segundo");
        
              
        if(num1>num2) {
            System.out.println("Efectivamente el primero es mayor al segundo su resultado es: " + num1);
        } 
        
        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Si son multiplos ambos");
        }
    }
    
    public static int pedirNum (String pedidos) {
        int num = 0;
    Scanner teclado = new Scanner (System.in);
        System.out.println("Brindame el "  + pedidos + " numero ");
        num = teclado.nextInt();
        
        return num;
    
    };
}
