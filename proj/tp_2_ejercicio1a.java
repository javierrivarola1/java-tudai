package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_2_ejercicio1a {

	public static void main(String[] args) {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
				int num;
				
				//num
				
			try {
				
				System.out.println("Brindame un numero: ");
				
				num = Integer.valueOf(entrada.readLine());
								
				if (num > 0) {
					System.out.println("El numero es positivo :" + num);
				}
				
				else { System.out.println("El numero es negativo" + num);
				
				}
				
			}
			catch (Exception e) {System.out.println(e);}
				
				
				//String
				
				//String nombre;
				
				//nombre = teclado.readLine();
				
				//char
				
				//char character;
				
				//character = teclado.readLine().charAt(0);
				
				//Boolean
				
				//boolean verdadero;
				
				//verdadero = Boolean.valueOf(teclado.readLine());
				
				//Float
				
				//float num2;
				
				//num2 = Float.valueOf(teclado.readLine());
				
				
		
		
	}

}
