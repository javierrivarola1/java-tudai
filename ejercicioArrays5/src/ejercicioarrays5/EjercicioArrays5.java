
package ejercicioarrays5;

import java.util.Scanner;

/*Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido.*/

public class EjercicioArrays5 {


    public static void main(String[] args) {
        
        final int MAX = 10;
        char array[] = new char[MAX];
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese " + MAX + "caracteres");
        
        for (int i = 0; i < MAX; i++) {
            System.out.println("Cargamos los datos " + (i+1));
            array[i] = teclado.next().charAt(0);
        }
        
        for (int i = 0; i < MAX; i++) {
            System.out.println(array[i]);
        }
        
        
        
    }
    
}
