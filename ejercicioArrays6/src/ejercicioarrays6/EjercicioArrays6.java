
package ejercicioarrays6;

/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.*/

public class EjercicioArrays6 {

 
    public static void main(String[] args) {
        
        final int MAX = 10;
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int cantidadPares = 0;
        
        for (int i = 0; i < MAX; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Los numeros son: " + array[i]);
                cantidadPares++;

            }

        }
        
        System.out.println("Cantidad de pares: " + cantidadPares);
        
    }
    
}
