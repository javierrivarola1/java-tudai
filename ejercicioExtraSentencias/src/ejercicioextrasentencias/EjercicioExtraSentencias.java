
package ejercicioextrasentencias;

import java.util.Scanner;


public class EjercicioExtraSentencias {

    
    //Menos de 5 paquetes NO VENDE
    // Entre 5 y 15 sale 10 dls el envio
    //Más de 15 envío es gratis

    public static void main(String[] args) {
        int cantidad;
        double montoTotal, diferencia, descuento, total;
        
        
        
        Scanner teclado = new Scanner (System.in);

        
        cantidad = teclado.nextInt();

        if (cantidad<5) {
        
            System.out.println("No vendemos ventas minoristas");
            
        } else {
      
              System.out.println("Ingrese el monto total de la compra");

               teclado = new Scanner (System.in);
               montoTotal = teclado.nextDouble();

              if (cantidad >=5 && cantidad <=15) {
                  montoTotal = montoTotal + 10;
                    System.out.println("El envio sale 10 dolares");
              } else {System.out.println("El envío es totalmente gratuito");

              }
        
        if (montoTotal<100) {
            diferencia = 100 - montoTotal;
            System.out.println("El monto es menor a 100, no posee promociones");
        } else {
            if (montoTotal >=100 && montoTotal<=300){
                
            descuento = montoTotal * 0.05;
            total = montoTotal - descuento;
            System.out.println("Usted tiene un descuento del 5% que equivale a: " + descuento
                    + "El monto total es de " + total);
            
            }else {
            
                descuento = montoTotal * 0.10;
            total = montoTotal - descuento;
            System.out.println("Usted tiene un descuento del 10% que equivale a:" + descuento
                    + "El monto total es de " + total);}
                
            }
        
        }
              
     } 
            
  }
    
}
