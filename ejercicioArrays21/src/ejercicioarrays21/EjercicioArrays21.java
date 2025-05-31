package ejercicioarrays21;


public class EjercicioArrays21 {

    public static final int MAX = 12;

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int cantidadElementos = MAX; // Contador de elementos válidos

        
        cantidadElementos = filtrarImpares(array, cantidadElementos);
        
        imprimirResultado(array, cantidadElementos);
    }

    public static int filtrarImpares(int[] array, int cantidadElementos) {
        for (int i = 0; i < cantidadElementos; i++) {
            if (array[i] % 2 == 0) { 
                cantidadElementos = corrimientoIzquierda(array, i, cantidadElementos);
              
            }
        }
        return cantidadElementos;
    }

    public static int corrimientoIzquierda(int[] array, int i, int cantidadElementos) {
        for (int j = i; j < cantidadElementos - 1; j++) {
            array[j] = array[j + 1]; // Movemos elementos hacia la izquierda
        }
        cantidadElementos--; // Reducimos la cantidad de elementos validos
        return cantidadElementos;
    }

    public static void imprimirResultado(int[] array, int cantidadElementos) {
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

