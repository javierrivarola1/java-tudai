/*
Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado (hacer uso de Utils.java). Luego
muestre el valor ingresado. ¿Qué pasa en este caso? ¿Se puede o
surge algún problema?


Al pedirlo una vez sola no hay problema, pero si se vuelve a asignar un número
va a tirar un error, ya que las constantes no se pueden modificar su valor, 
solamente puede modificarse los valores de las variables..

En este caso antes de poner teclado.nextInt se pone para nosotros;

num = int leerInt();
 */
package ejercicio_revision_selectivas3;

import java.util.Scanner;


public class Ejercicio_revision_selectivas3 {


    public static void main(String[] args) {
        
        final int num;
        int num2 = 2;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Brindame un número por favor: ");
        num = teclado.nextInt();
        
        System.out.println("El número que se asigno es: " + num);
        
    }
    
}
