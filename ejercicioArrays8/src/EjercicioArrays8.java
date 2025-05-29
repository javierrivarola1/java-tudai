public class EjercicioArrays8 {

    public static void main(String[] args) {
        final int MAX = 6; 
        int[] array = {3, 7, 5, 7, 2, 7}; 

        int numeroN = 7; 
        int numeroM = 12; 

        int cantidadPosiciones = contarOcurrencias(array, MAX, numeroN);
        
        
        int[] posiciones = buscarPosiciones(array, MAX, numeroN, cantidadPosiciones);

        mostrarPosiciones(posiciones, cantidadPosiciones);

        multiplicarOcurrencias(array, MAX, numeroN, numeroM);

        mostrarArreglo(array, MAX);
    }

    public static int contarOcurrencias(int[] array, int MAX, int numeroN) {
        int contador = 0;
        for (int i = 0; i < MAX; i++) {
            if (array[i] == numeroN) {
                contador++;
            }
        }
        // 3 veces
        return contador;
    } 

    public static int[] buscarPosiciones(int[] array, int MAX, int numeroN, int cantidadPosiciones) {
        int[] posiciones = new int[cantidadPosiciones];
        int index = 0;
        for (int i = 0; i < MAX; i++) {
            if (array[i] == numeroN) {
                posiciones[index] = i;
                index++;
            }
        }
        return posiciones;
    }

    public static void mostrarPosiciones(int[] posiciones, int cantidadPosiciones) {
        System.out.print("Posiciones donde aparece el número: ");
        for (int i = 0; i < cantidadPosiciones; i++) {
            System.out.print(posiciones[i] + " ");
        }
    }

    public static void multiplicarOcurrencias(int[] array, int MAX, int numero, int numeroM) {
        for (int i = 0; i < MAX; i++) {
            if (array[i] == numero) {
                array[i] *= numeroM;
            }
        } System.out.println();
    }

    public static void mostrarArreglo(int[] array, int MAX) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
