package tudai.proj;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("Brindame un numero");
		
		if (num1 > num2) {
			
			System.out.println("Es mayor");
		}

		else System.out.println("Es menor");
	}

}
 