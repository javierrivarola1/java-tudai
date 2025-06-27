package ejerciciomatriz_10;

public class EjercicioMatriz_10 {

    public static final int FILAS = 4;
    public static final int COLUMNAS = 20;

    public static int buscar_inicio(int[] matriz, int ini) {

        while (ini < COLUMNAS && matriz[ini] == 0) {

            ini++;
        }

        return ini;
    }

    public static int buscar_fin(int[] matriz, int ini) {

        while (ini < COLUMNAS && matriz[ini] != 0) {
            ini++;
        }
        return ini - 1;

    }

    public static void recorrer_secuencia(int[] matriz, int numPedido) {

        int ini = 0;
        int fin = -1;
        boolean estado = false;

        while (ini < COLUMNAS) {

            ini = buscar_inicio(matriz, fin + 1);

            if (ini < COLUMNAS) {

                fin = buscar_fin(matriz, ini);

                estado = buscarCoincidencias(matriz, numPedido, ini, fin);

                if (estado == true) {
                    System.out.print("Inicio de la cadena : " + ini + " " + " Final de la cadena : " + fin);
                }

            }

        }

    }

    public static boolean buscarCoincidencias(int[] matriz, int numPedido, int ini, int fin) {

        boolean coincidencia = false;

        while (ini <= fin && !coincidencia) {
            if (matriz[ini] == numPedido) {
                coincidencia = true;
            }
            ini++;
        }

        return coincidencia;

    }

    public static void main(String[] args) {

        int[][] matriz = {
            {0, 0, 3, 2, 1, 0, 4, 5, 0, 0, 7, 8, 9, 0, 0, 0, 6, 0, 0, 0},
            {0, 1, 2, 0, 0, 3, 4, 5, 0, 0, 0, 6, 7, 0, 8, 0, 9, 0, 0, 0},
            {0, 0, 0, 2, 3, 0, 4, 0, 0, 5, 6, 7, 0, 8, 9, 0, 0, 1, 0, 0}, //8, 9,
            {0, 6, 0, 7, 0, 0, 1, 2, 0, 0, 0, 4, 5, 0, 0, 3, 0, 0, 0, 0}
        };

        int numEntero = 9;
        int numFila = 2;

        recorrer_secuencia(matriz[2], numEntero);
    }

}
