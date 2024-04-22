package tudai.proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_2_ejercicio_1c {

	public static void main(String[] args) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int num;
		
		try {
			
			System.out.println("Brindame un numero :");
			
			num = Integer.valueOf(entrada.readLine());
			
			switch (num) {
			case 1: System.out.println("Lunes");break;
			case 2: System.out.println("Martes");break;
			case 3: System.out.println("Miercoles");break;
			case 4: System.out.println("Jueves");break;
			case 5: System.out.println("Viernes");break;
			
			default: System.out.println("Numero inválido");
			
			}

			
		}
		
		catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
