/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.

 */
package ejerciciomatrices_03;

public class EjercicioMatrices_03 {
    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
   
  

    public static void corrimiento_izquierda(int [] matriz, int j) {

    for(int i = j; i < COLUMNAS - 1; i++){

    matriz[i] = matriz[i+1];

        } 
 
      } 
    
    public static void buscarCoincidencia (int fila, int columna, int[][]matriz) {
    
        int i = 0; //de arriba para abajo
        int j = 0; //de izq a derecha
        boolean coincidenciaT = false;
        while(i<FILAS && coincidenciaT == false) {
            
            j=0;
            
        while (j<COLUMNAS && coincidenciaT == false) {
            
            if (i == fila && j == columna   ) {
                
                coincidenciaT = true;
                System.out.println("traerme la coincidencias" + i + j);
                
                corrimiento_izquierda (matriz[i], j);
            }
            
            j++; 
            
            
        }
        
        i++;

        }

    }
    
    public static void resultadodelaMatriz (int [][] matriz, int fila, int columna) {
    
       for (int j = 0; j < COLUMNAS; j++) {
        System.out.print(matriz[fila][j] + " ");
    }
    
    }
    
    public static void main(String[] args) {
        
         int[][] matriz = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}, // 31 32 33 34 36 37 38 39 40 0
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
        };
        
       int fila = 3;
       int columna = 4; //35
        
       buscarCoincidencia (fila,columna,matriz);
       
       resultadodelaMatriz(matriz, fila, columna);
       
        
    }
    
}
