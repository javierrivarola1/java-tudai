package tudai.proj;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("Si, el numero 1 es mayor que el numero 2 " + (num1 < num2) );

	}

}
 