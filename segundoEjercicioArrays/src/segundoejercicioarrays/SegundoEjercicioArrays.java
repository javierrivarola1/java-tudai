
/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.[]*/


package segundoejercicioarrays;


public class SegundoEjercicioArrays {
    public static int dameResultado(int array[], float promedio) {
    
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i]>promedio) {
                contador++;
            }
            
        } return contador;
    
    }
    public static void main(String[] args) {
      
        int array[] = {0, 1, 2, 3 ,4 ,5 ,6 ,7 ,8 ,9};   
        float resultado = 0;
        
        for (int i = 0; i < 10; i++) {
            resultado = resultado + array[i];
        }
        
        float promedio = resultado / 10;
        
        System.out.println("El promedio es: " + promedio);
        
        int contador = dameResultado(array,promedio);
        
        System.out.println("El resultado de los que estan por encima del promedio son: " + contador);
    }
    
    
    
}
