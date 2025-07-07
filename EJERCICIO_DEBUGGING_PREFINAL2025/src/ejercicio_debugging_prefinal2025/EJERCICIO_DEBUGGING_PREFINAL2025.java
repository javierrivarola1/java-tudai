/*
2DO EJERCICIO PREFINAL 2025, DEBUGGIN
 */


/* RESPUESTA 


i = 0
j = 4

arr i = 0
arr j = 2

valor = 30;

suma = 30;

------

i = 1
j = 4

arr i = 1
arr j = 2


valor = 18

suma = 12;


------

i = 1;
j= 3;

arr i = 1;
arr j = 0;

valor = 15;

suma = 27;

i = 2;
j = 3;

arr i = 2;
arr j = 0;

valor = 12;

suma = 15;

----------------

i = 2;
j = 2;

arr i = 2;
arr j = 2;

valor = 32;
suma = 47;

se corta el while



*/
package ejercicio_debugging_prefinal2025;


public class EJERCICIO_DEBUGGING_PREFINAL2025 {

    
    public static void main(String[] args) {
       
        final int MAX =5;
        int [][] matriz = {{10,20,30},
            {15,25,18},
            {12,22,32}};
        
        int [] arr = {0,1,2,0,2};
    
        int suma = 0, valor = 0, i = 0, j= MAX-1;
        
        while (i<=j) {
        
            valor = matriz [arr[i]] [arr[j]];
            if (valor < suma) {
                suma -= valor;
                j--;
            }else {
            
                suma += valor;
                i++;
            
            }
        
        
        }
    }
    
}
