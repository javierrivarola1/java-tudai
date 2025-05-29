/*
Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.
 */
package trabajoarrays8;


public class TrabajoArrays8 {

  
public static void main(String[] args) {
        final int CANTIDAD_ELEMENTOS = 8;
        int[] arreglo = {1, 2, 1, 7, 9, 11, 12, 13};

        boolean estaOrdenado = verificarOrdenAscendente(arreglo, CANTIDAD_ELEMENTOS);

        mostrarResultado(estaOrdenado);
    }

    public static boolean verificarOrdenAscendente(int[] arreglo, int cantidadElementos) {
        for (int i = 0; i < cantidadElementos - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarResultado(boolean estaOrdenado) {
        if (estaOrdenado) {
            System.out.println("El arreglo está en orden ascendente.");
        } else {
            System.out.println("El arreglo NO está en orden ascendente."); //LA CORRECTA porque se corta en el 2.
        }
    }
    
}
