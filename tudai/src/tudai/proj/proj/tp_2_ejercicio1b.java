package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_2_ejercicio1b {

	public static void main(String[] args) {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
	try {
		
		System.out.println("Brindame un numero :");
		
		num = Integer.valueOf(entrada.readLine());
		
	
	if (num > 100) {
		System.out.println("Grande :" + num);
	}
	
	else { System.out.println("Chico" + num );
	
	}
	
	}
	
	catch (Exception e) {System.out.println(e);}
	
	}

}
