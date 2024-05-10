package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercio4_tp2 {

	public static void main(String[] args) {
		
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		final int MAX = 999, MIN = 0;
		
		int num;
		
		
	try { 	
		
		System.out.println("Brindame un numero entre el 0 a 999: ");
		
		num = Integer.valueOf(entrada.readLine());
		
		while (num < MIN || num > MAX) {
            System.out.println("Ingresar un número entre 0 y 999");
            num = Integer.valueOf(entrada.readLine()); }
	
	if (num >= 100) {
		
	System.out.println("Mostrarme si tiene tres digitos :" + num);	
		
	} 
	
	else if (num >= 10) { System.out.println("Tiene dos digitos"); }
	
	else if (num < 10) { System.out.println("Tiene un digito"); }
	
	else System.out.println("No cumple con las condiciones");
	
	}
	
	
	
	catch (Exception e) {

		System.out.println("Si no es numero volver a ejecutar " + e);
		

	}

}
	
}
