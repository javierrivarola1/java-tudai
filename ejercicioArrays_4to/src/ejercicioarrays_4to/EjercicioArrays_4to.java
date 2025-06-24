/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y una posición fila, columna. Con estos datos tendrá que
realizar un corrimiento a derecha (se pierde el último valor en
dicha fila) y colocar el número en la matriz en la posición fila,
columna indicada.

 */
package ejercicioarrays_4to;


public class EjercicioArrays_4to {
public static final int FILAS = 5;
public static final int COLUMNAS = 10;

public static void corrimiento_derecha(int[] matriz, int columna) {
    for (int i = COLUMNAS - 1; i > columna; i--) {
        matriz[i] = matriz[i - 1];
    }
    
}

public static void buscarCoincidencia (int fila, int columna, int[][]matriz, int numEntero) {
    
        int i = 0; //de arriba para abajo
        int j = 0; //de izq a derecha
        boolean coincidenciaT = false;
        while(i<FILAS && coincidenciaT == false) {
            
            j = 0;
            
            
        while (j<COLUMNAS && coincidenciaT == false) {
            
            if (i == fila && j == columna   ) {
                
                coincidenciaT = true;
         
                
                corrimiento_derecha (matriz[i], columna);
                
                matriz[i][j] = numEntero;
            }
            
            j++;
            
            
        }
        
        i++;

        }

    }
    


    public static void main(String[] args) {
        
        
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };
        
        int numEntero = 5;
        int fila = 2;
        int columna = 6;
        
        buscarCoincidencia (fila, columna,matriz, numEntero);
        System.out.println(matriz[fila][columna]);
        
    }
    
}
