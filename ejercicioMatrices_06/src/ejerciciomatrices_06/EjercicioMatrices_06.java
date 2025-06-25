/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine todas las ocurrencia de número en la matriz si
existe. Mientras exista (en cada iteración tiene que buscar la
posición fila y columna) tendrá que usar dicha posición para
realizar un corrimiento a izquierda (quedarán tantas copias de la
última posición de cada fila como cantidad de ocurrencias del
número). Tener en cuenta, como se hizo en arreglos, si el
elemento a eliminar es el último de alguna fila de la matriz.

 */
package ejerciciomatrices_06;


public class EjercicioMatrices_06 {
public static final int FILAS = 5;
public static final int COLUMNAS = 10;
    

    public static void corrimientoIzquierda (int j, int []matriz) {
    
        for (int i = j; i < COLUMNAS-1; i++) {
            matriz[i] = matriz[i+1];
        }
        
    }
    public static void buscarCoincidencias (int [][] matriz, int numPedido) {
    
        int i = 0;
        int j = 0;
        while (i < FILAS) {

            j = 0;

            while (j < COLUMNAS ) {
                if (matriz[i][j] == numPedido && j == COLUMNAS-1){
                matriz[i][j] = matriz[i][j-1];
                }
                else if (matriz[i][j] == numPedido) {
                    corrimientoIzquierda(j, matriz[i]);

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
            {31, 12, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };
         
         int numPedido = 40;
         
         buscarCoincidencias (matriz, numPedido);
        
        for (int i = 0; i < matriz.length; i++) {
    System.out.print("| ");
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.printf("%-4d", matriz[i][j]);
    }
    System.out.println("|");
}
    }
    
}
