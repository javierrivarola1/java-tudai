/*
public static int divisorComunMaximo(int num1, int num2){
// determina el divisor común máximo de dos número
enteros
 int dcm = 1;
 int divisor = 2;
 while (divisor < num1 && divisor < num2) {
 if (num1 % divisor == 0 && num2 % divisor == 0) {
 dcm = divisor;
 }
 divisor++;
 }
 return dcm;
 }

 */
package ejerciciodebuggin1;


public class EjercicioDebuggin1 {
    
    public static int divisorComunMaximo(int num1, int num2){
 int dcm = 1;
 int divisor = 2;
 while (divisor < num1 && divisor < num2) {
 if (num1 % divisor == 0 && num2 % divisor == 0) {
 dcm = divisor;
 }
 divisor++;
 }
 return dcm;
 }
    public static void main(String[] args) {
        
            int num1 = 4;
            int num2 = 8;
            int resultado = divisorComunMaximo(num1, num2);
        
  
    }
    
}
