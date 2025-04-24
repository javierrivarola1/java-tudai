
package javaejerciciosbucles4;

import java.util.Scanner;


public class JavaEjerciciosBucles4 {


    public static void main(String[] args) {
      
        int num;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el numero por favor: ");
        num = teclado.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println("Traeme por favor todos los números " + i);
        }
    }
    
}
