
package ejerciciosiete;

import java.util.Scanner;


public class EjercicioSiete {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int num1, num2, num3, numeroDividido, tercero;
        System.out.println("Ingresar 3 numeros enteros por favor: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        numeroDividido = (num1 / num2);
        tercero = (numeroDividido - num3);
        
        System.out.println("El primer resultado de la division va a ser: " + numeroDividido);
        System.out.println("El resultado de la resta es de : " + tercero);
        
        
        

    }
    
}
