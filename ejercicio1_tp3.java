package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_tp3 {

	public static void main(String[] args) {

		int numero = 1;
		
		

		while (numero != 0) {

			numero = ingresarNumero();
			System.out.println(numero);

		}

	}

	public static int ingresarNumero() {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num = 1;
		
		try {
			
			
			System.out.println("Brindame un numero :");
			
			num = Integer.valueOf(entrada.readLine());
			
						
		}
		
		catch(Exception e) {
		
			System.out.println(e);			
			
			
		}
		
		return num;
		
	}

}
