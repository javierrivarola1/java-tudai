
package ejercicobucle2;

import java.util.Scanner;

public class EjercicoBucle2 {

    public static void main(String[] args) {
        boolean bandera = false;
        Scanner teclado = new Scanner (System.in);
        String respuesta;
        
        while (bandera == false) {
            System.out.println("Mi bandera esta en el estado: " + bandera);
            System.out.println("Queres seguir en nuestro programa? " + bandera);
            System.out.println("O te queres ir ? ");
            
            respuesta = teclado.next();
            
            if (respuesta.equals("Si")) {
                bandera = true;
            }
            
            System.out.println("----------------");
        }

    }
    
}
