import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej4 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("ingrese el primer nro entero por teclado");
            num1 = Integer.valueOf(entrada.readLine());

            // BufferedReader entrada = new BufferedReader(new
            // InputStreamReader(System.in));
            System.out.println("ingrese el 2do nro entero por teclado");
            num2 = Integer.valueOf(entrada.readLine());

            // BufferedReader entrada = new BufferedReader(new
            // InputStreamReader(System.in));
            System.out.println("ingrese el 3er nro entero por teclado");
            num3 = Integer.valueOf(entrada.readLine());

            // BufferedReader entrada4 = new BufferedReader(new
            // InputStreamReader(System.in));
            System.out.println("ingrese el 4to nro entero por teclado");
            num4 = Integer.valueOf(entrada.readLine());

            // BufferedReader entrada5 = new BufferedReader(new
            // InputStreamReader(System.in));
            System.out.println("ingrese el 5to nro entero por teclado");
            num5 = Integer.valueOf(entrada.readLine());

            System.out.println(num5 + " " + num4 + " " + num3 + " " + num2 + " " + num1);
        } catch (Exception exc) {
            System.out.println("error nro no valido ingresado");
        }
    }
}
