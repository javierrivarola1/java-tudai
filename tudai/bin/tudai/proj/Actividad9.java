package tudai.proj;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number;
		
		System.out.println("Brindame un numero: ");
		
		number = teclado.nextInt();
		
		int num1 = 2;
		int num2 = 3;
		int num3 = 6;
		
		int resultado1 = (number / num1);
		int resultado2 = (number / num2);
		int resultado3 = (number / num3);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		
	}

}
