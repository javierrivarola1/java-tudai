/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. // Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”.*/



package ejercicio_descendente5;


public class Ejercicio_Descendente5 {
    
   public static final int MAX = 4;
   
    public static void main(String[] args) {
            
        numEntero();
        System.out.println("Termino");
       
    }
    
    public static void numEntero () {
        
        
        for (int num = 1; num <= MAX; num++) {
            
            System.out.println(num);
        }
    }
    
}
