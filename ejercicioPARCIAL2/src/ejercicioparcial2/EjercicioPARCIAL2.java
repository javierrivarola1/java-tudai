/*
Un dispositivo que toma imágenes de un fenómeno natural está corriendo sobre una plataforma tecnológica
con recursos limitados. Cada imagen (representada por una matriz de NxM) está compuesta por píxeles con
valores entre 0 y 255. Se desea implementar un algoritmo de compresión que comprima aquellas porciones
de la imagen distintas del color negro (0 en la escala de valores del pixel). Se debe implementar la solución
para un arreglo (luego dicha solución se reutilizará en un futuro para cada fila de la matriz). Para ello, se pide
realizar un programa en JAVA que, dado un arreglo de tamaño M, para cada secuencia delimitada por uno o
mas pixeles de color negro (valor 0) con más de X repeticiones de un valor de píxel (todos los elementos de la
secuencia deben ser iguales), comprima la secuencia poniendo en la primera posición el valor negado de la
cantidad de ocurrencias y a continuación el valor del pixel que se repite. El arreglo empieza y termina con un
separador 0 (color negro). Implementar usando las buenas prácticas de programación estructurada vistas en
la cátedra
 */
package ejercicioparcial2;

public class EjercicioPARCIAL2 {

    public static final int MAX = 20;

    public static boolean buscarRepeticiones(int[] arrM, int ini, int fin) {

        while ((ini < fin) && (arrM[ini] == arrM[ini + 1])) {
            ini++;
        }
        return ini == fin;

    }

    public static void corrimientoIzquierda(int[] arrM, int ini) {

        for (int i = ini; i < MAX - 1; i++) {
            arrM[i] = arrM[i + 1];
        }

    }

    public static void borrarCadena(int[] arrM, int ini, int fin) {

        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arrM, ini);
        }

    }

    public static int buscarIni(int[] arrM, int fin) {

        while (fin < MAX && arrM[fin] == 0) {

            fin++;

        }
        return fin;

    }

    public static int buscarFin(int[] arrM, int ini) {

        while (ini < MAX && arrM[ini] != 0) {

            ini++;

        }
        return ini - 1;

    }

    public static void recorrerSecuencia(int[] arrM) {

        int ini = 0;
        int fin = -1;

        while (ini < MAX) {

            ini = buscarIni(arrM, fin + 1);

            if (ini < MAX) {

                fin = buscarFin(arrM, ini);
                int tamanio = fin-ini+1;
                if ((buscarRepeticiones(arrM, ini, fin) && tamanio>1)) {
                    

                    borrarCadena(arrM, ini + 2, fin);
                    
                    arrM[ini] = -(tamanio);
                    fin = ini+1;
                }
            }

        }

    }
    
    public static void nuevaArr (int [] arrM) {
    
        for (int i = 0; i < MAX; i++) {
            System.out.println(arrM[i]);
        }
    
    }

    public static void main(String[] args) {

        int[] M = {0, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0, 0};

        recorrerSecuencia(M);
        
        nuevaArr (M);

    }

}
