// Escribir un programa que declare una constante de tipo int y pida el
// ingreso de un valor por teclado. Luego muestre el valor ingresado.
// ¿Qué pasa en este caso? ¿Se puede o surge algún problema?

import java.io.BufferedReader; // Lee texto de una secuencia de entrada de caracteres y almacena en búfer 
import java.io.InputStreamReader;

public class ej3 {
    public static void main(String[] args) {
        final int minimo = 1;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un nro entero por teclado");
            int nuevaVariable = Integer.valueOf(entrada.readLine());// le guardas el nro que ingresa el usuario como


            System.out.println(minimo);
            System.out.println(nuevaVariable);

        } catch (Exception exc) {
            System.out.println("error nro no valido ingresado" + " " + exc);
        }
    }
}
