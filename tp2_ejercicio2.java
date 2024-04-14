package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp2_ejercicio2 {

	public static void main(String[] args) {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int num;

		int anio;

		try {

			System.out.println("Brindame un numero :");

			num = Integer.valueOf(entrada.readLine());

			switch (num) {

			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("Es un mes con 31 días");
				break;
			case 2: {
				System.out.println("Brindame un año: ");

				anio = Integer.valueOf(entrada.readLine());

				if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {

					System.out.println("El año es bisiesto");

				}

				else {
					System.out.println("No es un año bisiesto");
				}
			}
				;
				break;

			case 4, 6, 9, 11:
				System.out.println("Es un mes de 30 días");
				break;

			default:
				System.out.println("Brindame un numero, no un character");

			}

		}

		catch (Exception e) {

			System.out.println(e);

		}

	}

}
