
package ejemplowhile1;

import java.util.Scanner;


public class EjemploWhile1 {

    
    //Dado un número N mayor a 0 (ingresado por el usuario), calcular e
    //informar por consola la suma de todos los números enteros
    //comprendidos entre 1 y N. 


    public static void main(String[] args) {
        
        int num, contador, total;
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("Necesito que me brindes un número mayor a 0: ");
        num = teclado.nextInt();
        contador = 1;
        total = 0;
        
        
        while (num > 0 && contador <= num){
            
            total = total + contador;
        
            System.out.println("La suma de : " + total);
            
            contador++;
            
        }
        
       
    }
    
}
