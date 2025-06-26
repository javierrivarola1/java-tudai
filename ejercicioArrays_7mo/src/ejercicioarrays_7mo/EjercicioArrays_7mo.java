/*
Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y luego inserte el
número en la matriz en la fila indicada manteniendo su orden.


 */
package ejercicioarrays_7mo;


public class EjercicioArrays_7mo {
public static final int FILAS = 4;
public static final int COLUMNAS = 5;

    public static void corrimientoDerecha (int [] matriz,int j) {
    
        for (int i = COLUMNAS-1; i < j; i++) {
            matriz[i] = matriz [i-1];
        }
        
    }
    public static void insertarNum (int [] matriz, int numPedido) {
   
        int j = 0;
        boolean corte = false;
        while (j<COLUMNAS && !corte) {
        
            if (matriz[j]>numPedido) {
                corrimientoDerecha (matriz, j);
                matriz[j] = numPedido;
                corte = true;
            }
            
            j++;
            
            
            
        } if (!corte) {
            matriz[COLUMNAS-1]=numPedido;
        }
        
        
    }
    public static void main(String[] args) {
        
        int numPedido = 25;
        int filaPedida = 2;
        
        int[][] matriz = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20}
        };
        
        insertarNum (matriz[filaPedida], numPedido);
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println("|");
        }
    

    }
    
    
    
}
