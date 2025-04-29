
package ejercicioiterativas2;

import java.util.Scanner;


public class EjercicioIterativas2 {

    public static void main(String[] args) {
        
        char caracter;
        Scanner teclado = new Scanner (System.in);
        
        
        System.out.println("Ingere un caracter :");
         caracter = teclado.next().charAt(0);
         
         while (caracter != '*') {
         
             if ( caracter >= '0' && caracter <= '9' ) {
             
                 System.out.println("El carcter es de un solo digito " + caracter);
             
             } else { switch(caracter) {
                  case 'a': case 'e': case 'i': case 'o': case 'u':
                        System.out.println(caracter + " es una vocal minúscula. ");
                        break;
                 default: System.out.println("No es vocal ni tampoco número, elija alguna de esas dos opciones :"); }    
             }
             
            System.out.println("Eligir por favor o '*' para cerrar con la consulta: ");
                caracter = teclado.next().charAt(0);
             
             
         }
        
    }
    
}
