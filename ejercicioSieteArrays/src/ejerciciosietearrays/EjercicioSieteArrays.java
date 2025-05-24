/*7. Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.*/


package ejerciciosietearrays;


public class EjercicioSieteArrays {


    public static int obtenerTamaño(int array1[], int N){
    
         int contador = 0;
     for (int i = 0; i < 10; i++) {
            if (array1[i] == N) {
                contador++;
            } 
        } 
        
        return contador;
    
    }
    
    public static void cargarArreglo(int array1[], int array2[], int N) {
    
         int posicion = 0;
        
        for (int i = 0; i < 10; i++) {
            
            if (array1[i] == N) {
                
                array2[posicion] = i;
                
                posicion++;
            } 
            
        } 
        
    }
    
    public static void multiplicarNum(int array1[], int array2[], int M) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == array2[j]) {
                    array1[i] = array1[i] * M;
                }
            }
        }

    }
    
    public static void main(String[] args) {
        
        int array1[] = {10, 30, 10, 50, 60, 70, 10, 12, 14, 15};
        int N = 10;
        int M = 5;
        int tamaño = obtenerTamaño(array1,N);
        int array2[] = new int [tamaño];
        cargarArreglo(array1, array2, N);
        multiplicarNum(array1, array2, M);
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(array1[i]);
        }


     // tercer metodo
    }

}


                