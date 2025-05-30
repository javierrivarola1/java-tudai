/*
Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. EJERCICIO 
 */
package ejercicioarray;


public class EjercicioArray {


    public static void main(String[] args) {
        final int CANTIDAD_LETRAS = 8;
        char[] letras = {'d', 'b', 'c', 'e', 'f', 'h', 'z', 'a'};

        boolean hayRepetida = contieneRepetidas(letras, CANTIDAD_LETRAS);

        mostrarResultado(hayRepetida);
    }

    public static boolean contieneRepetidas(char[] arregloLetras, int CANTIDAD_LETRAS) {
        for (int i = 0; i < CANTIDAD_LETRAS - 1; i++) {
            for (int j = i + 1; j < CANTIDAD_LETRAS; j++) {
                //Mostramos la comparación actual
                System.out.println("Comparando índice i " + i + " con índice j " + j + " ");

                if (arregloLetras[i] == arregloLetras[j]) {
                    System.out.println("Repetido encontrado: " + arregloLetras[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostrarResultado(boolean tieneRepetida) {
        if (tieneRepetida) {
            System.out.println("El arreglo contiene al menos una letra repetida.");
        } else {
            System.out.println("El arreglo no tiene letras repetidas.");
        }
    }
    
}
