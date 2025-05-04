
package ejercicio_prueba1;

import java.util.Scanner;


public class Ejercicio_prueba1 {

  
    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Por favor brindame tu primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Por favor brindame tu segundo numero: ");
        num2 = teclado.nextInt();
        
        if(num1>num2) {
            System.out.println("Efectivamente el primero es mayor al segundo su resultado es: " + num1);
        } 
        
        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Si son multiplos ambos");
        }
    }
    
}
