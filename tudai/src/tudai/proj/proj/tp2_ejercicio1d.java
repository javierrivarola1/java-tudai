package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp2_ejercicio1d {

	public static void main(String[] args) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		char character;
		
		try {
			
			System.out.println("Dame una letra nueva : ");
			
			character = entrada.readLine().charAt(0);
			
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				
			System.out.println("Es vocal");			
		}
		
		else { System.out.println("Es consonante");
		
		}
			
		}		
		
		catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
