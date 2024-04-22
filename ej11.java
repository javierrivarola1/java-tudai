import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej11 {
    public static void main(String[] args) {
        int num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ingrese un numero entero ");
            num = Integer.valueOf(entrada.readLine());

            System.out.println((num % 6 == 0 && num % 7 == 0) ? "es multiplo de 6 y 7" : "no es múltiplo de 6 y de 7");
            System.out.println((num / 5 > 10) ? "el cociente de la división de dicho número por 5 es mayor que 10"
                    : "el cociente de la división de dicho número por 5 NO es mayor que 10");

            // las sig 2 lineas debrian haber estado en una sola condicion , esta mal
            System.out.println(
                    ((num > 30 && num % 2 == 0 || num <= 30) ? "es mayor a 30 y múltiplo de 2, o es menorde 30 y multiplo de 2"
                            : "no es es mayor a 30 y múltiplo de 2"));
           
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
