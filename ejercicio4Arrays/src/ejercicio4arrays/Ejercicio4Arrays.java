
package ejercicio4arrays;

import java.util.Scanner;


/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.*/

public class Ejercicio4Arrays {

  
    public static void main(String[] args) {

        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        Scanner teclado = new Scanner(System.in);
        
          System.out.println("Dame un character por favor: ");
            char elemento = teclado.next().charAt(0);
            
            boolean encontrado = false;

        for (int i = 0; i < 10; i++) {

              if (arr[i] == elemento) {
                  encontrado = true;
                System.out.println("Encontramos tu elemento y es: " + elemento + " en la posicion " + i);
            } else if (!encontrado) {
                System.out.println("El elemento no se encuentra en la Array.");
            }

        }
        
    }
    
}
