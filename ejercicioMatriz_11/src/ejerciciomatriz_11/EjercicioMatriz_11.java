/*
Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor
 */
package ejerciciomatriz_11;


public class EjercicioMatriz_11 {

    public static final int FILAS = 4;
    public static final int COLUMNAS = 20;
    
public static int buscar_ini (int [] matriz, int fin ) {

while (fin < COLUMNAS && matriz[fin] == 0) {
   fin++;
   
} return fin;

} 

public static int buscar_fin ( int [] matriz, int ini) {

while (ini<COLUMNAS && matriz[ini] != 0) {

ini++;
    
} return ini-1;
    
}
    
 public static int sumar_cadenas (int [] matriz, int ini, int fin) {
 
     int suma = 0;
     for (int i = ini; i <= fin; i++) {
         suma += matriz[i];
     } return suma;
 }   
 
public static void recorrer_columnas (int [] matriz) {

        int ini = 0, fin = -1,  sumaMAXIMA = 0; int inisumaMAXIMA =0; int finsumaMAXIMA = 0;

        while (ini < COLUMNAS) {

            ini = buscar_ini(matriz, fin + 1);

            if (ini < COLUMNAS) {

                fin = buscar_fin(matriz, ini);
               int suma = sumar_cadenas (matriz, ini, fin);
                if(suma>sumaMAXIMA) {
                
                    sumaMAXIMA = suma;
                   inisumaMAXIMA = ini;
                   finsumaMAXIMA = fin;
 
                }
                
                
            }

        } 
        
        System.out.println("Inicio " + " " + inisumaMAXIMA + " " + "fin " + " " + finsumaMAXIMA + " " + "y su suma es de " + " " + sumaMAXIMA);

    }

public static void recorrer_filas (int [][] matriz) {

    for (int i = 0; i < FILAS; i++) {
        recorrer_columnas (matriz[i]);
    }

    
};

    

    public static void main(String[] args) {
        
         int[][] matriz = {                 
            {0, 0, 3, 2, 1, 0, 4, 5, 0, 0, 7, 8, 9, 0, 0, 0, 6, 0, 0, 0},
            {0, 1, 2, 0, 0, 3, 4, 5, 0, 0, 0, 6, 7, 0, 8, 0, 9, 0, 0, 0},
            {0, 0, 0, 2, 3, 0, 4, 0, 0, 5, 6, 7, 0, 8, 9, 0, 0, 1, 0, 0}, 
            {0, 6, 0, 7, 0, 0, 1, 2, 0, 0, 0, 4, 5, 0, 0, 3, 0, 0, 0, 0}
        };

        recorrer_filas (matriz);
        
        
    }
    
}
