
package ejercicioseis;

import java.util.Scanner;


public class EjercicioSeis {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Factura de la compra realizada");
        
        System.out.println("Que tipo de factura es? ");
        char tipodeFactura = teclado.next().charAt(0);
        System.out.println("Pone el numero de factura: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("pone el nombre del comprador: ");
        String nombre = teclado.nextLine(); 
        System.out.println("Nombre del producto1: ");
        String producto1 = teclado.nextLine();
        System.out.println("Pone el importe del producto1: ");
        double importe1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Nombre del producto2: ");
        String producto2 = teclado.nextLine();
        System.out.println("Pone el importe del producto2: ");
        double importe2 = teclado.nextDouble();
        System.out.println("Importe total: ");
        double importeTotal = (importe1 + importe2);
        
        System.out.println("Factura" + "\t" + tipodeFactura + "\t" + numero);
        System.out.println("Nombre: " + nombre);
        System.out.println("Producto" + "\t" + "Importe");
        System.out.println(producto1 + "\t" + "\t" + importe1);
        System.out.println(producto2 + "\t" + "\t" + importe2);
        System.out.println("Importe total" + "\t" + importeTotal);
    }
    
}
