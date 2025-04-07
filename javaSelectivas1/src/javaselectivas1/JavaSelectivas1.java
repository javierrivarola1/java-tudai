
package javaselectivas1;

import java.util.Scanner;


public class JavaSelectivas1 {

    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Por favor ingrese un numero: ");
        num1=teclado.nextInt();
        
if (num1> 0) {      
     System.out.println("El numero es positivo");
     
}  
else {
    System.out.println("El numero es negativo");
}

if (num1 > 100) {
    
        System.out.println("Es grande");
    
} else { System.out.println("Es chico"); }

    }    
}
