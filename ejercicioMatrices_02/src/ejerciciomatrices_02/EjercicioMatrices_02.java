/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.
ns
 */
package ejerciciomatrices_02;


public class EjercicioMatrices_02 {
public static final int FILAS = 5;
public static final int COLUMNAS = 10;
public static final int[][] matriz = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };
        
    public static void numerosPares(int [][] matriz){
    
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (matriz[i][j] % 2 == 0){
                    System.out.println("Traerme solamente los numeros pares " + matriz[i][j])
                            ;
                }
            }
        }
    
    };
    public static void main(String[] args) {
        
   
        
        numerosPares(matriz);      
        
        
        
    }
    
}
