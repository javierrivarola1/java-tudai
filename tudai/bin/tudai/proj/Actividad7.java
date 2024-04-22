import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej7 {
    public static void main(String[] args) {
        int num1, num2, num3;
        float resultado;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ingrese un numero entero 1");
            num1 = Integer.valueOf(entrada.readLine());

            System.out.println("ingrese un numero 2");
            num2 = Integer.valueOf(entrada.readLine());

            System.out.println("ingrese un numero 3");
            num3 = Integer.valueOf(entrada.readLine());

            resultado = (num1 / num2) - num3;

            System.out.println(resultado);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
