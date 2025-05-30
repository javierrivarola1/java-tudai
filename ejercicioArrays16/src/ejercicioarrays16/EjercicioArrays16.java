
package ejercicioarrays16;

/*Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.*/


public class EjercicioArrays16 {

  public static final int MAX = 10;
    public static void main(String[] args) {
       
        
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        int possPedida = 5;
        corrimientoIzquierda(possPedida, array);
        mostrarCorrimiento(array);
        
        
    }

    public static void corrimientoIzquierda(int possPedida, int array[]) {

        for (int i = possPedida; i < MAX -1 ; i++) {
            array[i] = array[i + 1];

        }
    }

    public static void mostrarCorrimiento(int array[]) {

        for (int i = 0; i < MAX; i++) {
            System.out.println("Mostrame el nuevo elemento de la Array " + array[i]);
        }

    }

}
