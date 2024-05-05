
// Escribir un programa que solicite el ingreso de un número mayor a
// 50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej3 {
    public static void main(String[] args) {
        int numero;
        final int MIN = 50;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingresar un número MAYOR  a 50");
            numero = Integer.valueOf(entrada.readLine());
            while (numero < MIN) {
                System.out.println("Ingresar un número valido");
                numero = Integer.valueOf(entrada.readLine());
            }
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        } catch (Exception e) {
            System.out.println("Error en tipo de dato" + e);
        }
    }
}
