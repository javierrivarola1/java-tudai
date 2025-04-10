
package ejerciciossentenciasdos;

import java.util.Scanner;


public class EjerciciosSentenciasDos {


    public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingresa el número de mes: ");
        int mes = scanner.nextInt();
        int dias;
        
        if (mes == 2) {
            System.out.print("Ingresa el año: ");
            int anio = scanner.nextInt();
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                dias = 29;
            } else {
                dias = 28;
            }
             } else {
            switch (mes) {
                case 4: case 6: case 9: case 11:
                    dias = 30;
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias = 31;
                    break;
                default:
                    System.out.println("Mes inválido.");
                    
            }
        }

        
    }
    
}
