
package javaejercicioselectivas1b;

import java.util.Scanner;


public class JavaEjercicioSelectivas1B {


    public static void main(String[] args) {
        
        //Solicitar un numero del 1 al 7 y que imprima dia de la semana.
        
        int num;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Por favor ingresar numero: ");
        num = teclado.nextInt();
        
        switch (num) {
            case 1: System.out.println("Es lunes");
            break;
            case 2: System.out.println("Es martes");
            break;
            case 3: System.out.println("Es miercoles");
            break;
            case 4: System.out.println("Es Jueves");
            break;
            case 5: System.out.println("Es Viernes");
            break;
            case 6: System.out.println("Es Sabado");
            break;
            case 7: System.out.println("Es Domingo");
            break;
            default: System.out.println("Numero de día invalido");
        }}
            
    }
    
}
