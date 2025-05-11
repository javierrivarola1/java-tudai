
package ejerciciodescendente10;

import java.util.Scanner;


public class EjercicioDescendente10 {

    
    public static Scanner teclado = new Scanner (System.in);
    
    public static void verificarCaracter() {
    
        System.out.println("Ingresarme un caracter: ");
                  char character = teclado.next().charAt(0);
                  if (character >= 'a' && character <= 'z') {
                      System.out.println("El caracter es de letra minuscula " + character);
                  } else if (character >= 'A' && character <= 'Z') {
                      System.out.println("El caracter es de letra mayúscula " + character);
                  } else if (character >= '0' && character <= '9') {
                      System.out.println("El caracter corresponde a un numero " + character);
                  } else {System.out.println("Es otro tipo de caracter " + character);}
        
    }
    public static void imprimirTabla(int num1) {
        int resultado;
                for (int i = 0; i <= 10; i++) {
                    resultado = num1 * i;
                    System.out.println(num1 + " por " + i + " es igual a " + resultado);
                }
    }
    public static void main(String[] args) {

        int num1 = 1;
        

        while (num1 >= 1 && num1 <= 10) {

            System.out.println("ingresa un numero por favor: ");
            num1 = teclado.nextInt();

            if (num1 % 3 == 0) {
                verificarCaracter();
            }
            if (num1 % 5 == 0) {
                imprimirTabla(num1);
                }
            }
        }

    }
          
          
          
