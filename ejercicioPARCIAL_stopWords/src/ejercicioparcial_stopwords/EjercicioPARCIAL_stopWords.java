/*
Ejercicio tipo parcial
Cuando se debe procesar texto expresado en lenguaje natural, una de las primeras tareas que se realiza es la
de eliminación de stopwords. Las stopwords son palabras muy comunes en un determinado lenguaje, por
ejemplo, artículos (el, la, las, los…), preposiciones (a, ante, con, por…), etc.
Dado un texto almacenado en un arreglo de caracteres de tamaño MAX_A, donde cada palabra está delimitada
por espacios, comas (,) o puntos (.) se pide eliminar todas las stopwords almacenadas en otro arreglo de
caracteres de tamaño MAX_S que se encuentra delimitado por espacios.
Por ejemplo, dado un texto almacenado en un arreglo A
 */
package ejercicioparcial_stopwords;


public class EjercicioPARCIAL_stopWords {
public static final char MAX_A = 42;
public static final char MAX_S = 20;

    public static int buscarFin(char[] arrA, int ini, int MAX) {

        while (ini < MAX && arrA[ini] != ' ') {

            ini++;

        }
        return ini - 1;

    }

    public static int buscarIni(char[] arrA, int fin, int MAX) {

        while (fin < MAX && arrA[fin] == ' ') {

            fin++;

        }
        return fin;

    }
    
    public static void borrarCadena (char [] arrA, int ini, int fin) {
    
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arrA, ini);
        }
    
    }
    
    public static void corrimientoIzquierda (char [] arrA, int ini) {
    
        for (int i = ini; i < MAX_A-1; i++) {
            arrA[i] = arrA[i+1];
        }
        
        
    }

    public static void recorrerArrayA(char[] arrA,char [] arrS) {

        int ini = 0;
        int fin = -1;
       
        while (ini < MAX_A) {

            ini = buscarIni(arrA, fin + 1, MAX_A);

            if (ini < MAX_A) {

                fin = buscarFin(arrA, ini, MAX_A);
                int tamanio =  fin - ini+1;
                if (recorrerArrayS(arrS, arrA, ini, fin, tamanio)) {
   
                    fin = ini;
                } 
            }
        }

   }
    
    public static boolean buscarCoincidencia (char [] arrS, char [] arrA, int iniA, int finA, int iniS, int finS) {
    
        int reinicio = iniS;

        while (iniA <= finA && iniS <= finS) {

            iniS = reinicio;

            while (iniS <= finS && arrA[iniA] != arrS[iniS]) {
                iniS++;
            }

            iniA++;
        }

        return iniA > finA;
    
    }
    
    public static boolean recorrerArrayS (char [] arrS , char [] arrA ,int iniA, int finA, int tamanio) {
    
            int ini = 0;
            int fin = -1;
            boolean respuesta = false;
        
             while (ini < MAX_S) {

            ini = buscarIni(arrS, fin + 1, MAX_S);

            if (ini < MAX_S) {

                fin = buscarFin(arrS, ini, MAX_S);

                     if (tamanio == fin - ini + 1 && buscarCoincidencia(arrS, arrA, iniA, finA, ini, fin)) {
                         
                         respuesta = true;
                         
                         borrarCadena(arrA, iniA, finA);
                         
                     }
                 }
        } 
             return respuesta;
    }


    public static void main(String[] args) {
        
        char[] arrA = {
    ' ' ,'l','a',' ','c','a','s','a',' ','r','o','j','a',',',' ',
    'a',' ','l','a',' ','v','u','e','l','t','a',' ',
    'd','e',' ','l','a',' ','e','s','q','u','i','n','a','.', ' '
};

        char[] arrS = {
    ' ' ,'a',' ','l','o',' ','l','o','s',' ','d','e',' ',
    'l','a',' ','l','a','s', ' ' 
};

        recorrerArrayA (arrA, arrS);
        
        for (int i = 0; i < MAX_A; i++) {
            System.out.println( arrA[i]);
        }
        
    }
    
}
