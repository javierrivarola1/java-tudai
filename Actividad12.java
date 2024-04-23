package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad12 {

	public static void main(String[] args) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int num1;

		int num2;
		
		try {
			
			System.out.println("Brindame un numero :");

			num1 = Integer.valueOf(entrada.readLine());
			
			num1 = num1 + 1;
			
			System.out.println("El num que asciende es: " + num1);
			
			System.out.println("Brindame un segundo numero :");
			
			num2 = Integer.valueOf(entrada.readLine());
			
			num2 = num2 - 1 ;
			
			System.out.println("El numero que desciende es :" + num2);
				
			
		}
		
		catch (Exception e) { System.out.println(e); }
		
		
	}

}
