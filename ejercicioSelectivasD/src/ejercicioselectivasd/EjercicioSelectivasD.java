
package ejercicioselectivasd;

import java.util.Scanner;


public class EjercicioSelectivasD {

    
    // solicite 3 números e imprima “creciente” si los tres números están en orden creciente, “decreciente” si están en orden
// decreciente o “error” si no cumplen ningún orden

    public static void main(String[] args) {
     
        int num1;
        int num2;
        int num3;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Danos el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Danos el segundo numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Danos un tercer numero: ");
        num3 = teclado.nextInt();
        
        if (num1 < num2 && num2 < num3) {
            System.out.println("El numero es creciente");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("El numero es decreciente");
           } else { System.out.println("error"); }        
    }
    
}
