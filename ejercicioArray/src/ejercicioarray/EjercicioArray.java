/*
Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. EJERCICIO9 
 */
package ejercicioarray;


public class EjercicioArray {


    public static void main(String[] args) {
        final int CANTIDAD_LETRAS = 8;
        char[] letras = {'d', 'b', 'b', 'e', 'f', 'h', 'z', 'a'};

        boolean hayRepetida = contieneRepetidas(letras, CANTIDAD_LETRAS);

        mostrarResultado(hayRepetida);
    }

    public static boolean contieneRepetidas(char[] arregloLetras, int CANTIDAD_LETRAS) {
        for (int i = 0; i < CANTIDAD_LETRAS; i++) {
            for (int j = 0; j < CANTIDAD_LETRAS; j++) {
                //Mostramos la comparación actual
                System.out.println("Comparando índice i " + i + " con índice j " + j + " ");
                
                

                if (i != j && arregloLetras[i] == arregloLetras[j]) {
                    System.out.println("Repetido encontrado: " + arregloLetras[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostrarResultado(boolean hayRepetida) {
        if (hayRepetida) {
            System.out.println("El arreglo contiene al menos una letra repetida.");
        } else {
            System.out.println("El arreglo no tiene letras repetidas.");
        }
    }
    
}
