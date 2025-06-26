/*
 Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y elimine la primera
ocurrencia de número en la fila indicada (un número igual) si
existe.

 */
package ejerciciomatriz_8vo;


public class EjercicioMatriz_8vo {

    public static final int FILAS = 4;
    public static final int COLUMNAS = 5;
    
    
    public static void eliminarIzquierda (int [] matriz, int j) {
    
        for (int i = j; i < COLUMNAS-1 ; i++) {
            matriz[i] = matriz[i+1];
        }

    }
    
    public static void buscarOcurrencias(int [] matriz,int numPedido) {
    
     int j = 0;
     
     
     while(j < COLUMNAS && matriz[j] <= numPedido) {
        
         if (matriz[j] == numPedido && j == COLUMNAS-1) {
         matriz [j] = matriz [j-1];
         }
         else if (matriz[j] == numPedido ) {
             
            eliminarIzquierda (matriz, j);
         }  
         
         j++;
     }
        
    
    };
    
    public static void main(String[] args) {
        
        int numPedido = 7;
        int numeroFila = 1;
        
        int [][] matriz = {
        {1, 2, 3, 4, 5}, 
        {6, 7, 8, 9, 10}, // ocho
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20}
        };
        
        buscarOcurrencias (matriz[numeroFila], numPedido);
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println("|");
        }
    }
    
}
