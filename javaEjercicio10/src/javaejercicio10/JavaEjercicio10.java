
package javaejercicio10;

import java.util.Scanner;

public class JavaEjercicio10 {


    public static void main(String[] args) {
     
        int num1;
        int num2;
        
        
         Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("Por favor ingrese un numero en pantalla: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ahora por favor ingresa el segundo numero en pantalla: ");
        num2 = teclado.nextInt();
        
        System.out.println("Si el primero numero es mayor al segundo mostramelo acá: " + (num1 > num2));
        System.out.println("Si, ambos son multiplos de 2: " + (num1 % 2 == 0 && num2 % 2 == 0));  
        
        
    }
    
}
