/*
EXAMEN PREFINAL
 */
package examenprefinal2025_;


public class ExamenPREFINAL2025_ {

 
        public static final int MAXF = 4;
	public static final int MAXC = 40;
	public static final int MAX = 5;

	public static void recorrerMatriz(char[][] matriz, char[] arrC) {

		int actual = MAXC, fila = 0;

		for (int i = 0; i < MAXF; i++) {
			int cantidad = recorrerSecuencia(matriz[i], arrC);

			if (cantidad < actual) {
				fila = i;
				actual = cantidad;}
		}

		System.out.println("La fila con menores cambios fue la " + fila + " Con " + actual + " cambios");
	}

	public static int recorrerSecuencia(char[] arr, char[] arrC) {

		int ini = 0, fin = -1, contador = 0;

		while (ini < MAXC && fin + 2 < MAXC) {

			ini = buscarIni(arr, fin + 1);

			if (ini < MAXC) {

				fin = buscarFin(arr, ini);

				int desplazamiento = convertir_geringoso(arr, arrC, ini, fin, fin);
				fin += desplazamiento;
				contador += desplazamiento / 2;

			}

		}
		return contador;
	}

	public static int convertir_geringoso(char[] arr, char[] arrC, int ini, int fin, int longitud) {
		while (ini <= fin) {
			if (buscar_vocal(arr[ini]) && fin < MAXC - 1) {
				fin += agregar_geringoso(arr, ini, identificar_letra(arrC, arr[ini]));
				ini += 3;
			} else
				ini++;
		}
		return fin - longitud;
	}

	public static int agregar_geringoso(char[] arr, int ini, char consonante) {

		for (int i = ini; i < ini + 2; i++)
			insertar_elemento(arr, i);

		arr[ini + 1] = consonante;

		return 2;
	}

	public static void insertar_elemento(char[] arr, int pos) {
		for (int i = MAXC - 1; i > pos; i--)
			arr[i] = arr[i - 1];
	}

	public static char identificar_letra(char[] arrC, char vocal) {
		char consonante = arrC[0];
		switch (vocal) {
		case 'a', 'A':
			consonante = arrC[0];
			break;
		case 'e', 'E':
			consonante = arrC[1];
			break;
		case 'i', 'I':
			consonante = arrC[2];
			break;
		case 'o', 'O':
			consonante = arrC[3];
			break;
		case 'u', 'U':
			consonante = arrC[4];
			break;
		}
		return consonante;
	}

	public static boolean buscar_vocal(char letra) {
		boolean vocal = false;
		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			vocal = true;
			break;
		}
		return vocal;
	}

	public static int buscarIni(char[] arr, int fin) {
		while (fin < MAXC && ((arr[fin] < 'A' || arr[fin] > 'Z') && (arr[fin] < 'a' || arr[fin] > 'z')))
			fin++;

		return fin;
	}

	public static int buscarFin(char[] arr, int ini) {
		while (ini < MAXC && ((arr[ini] >= 'A' && arr[ini] <= 'Z') || (arr[ini] >= 'a' && arr[ini] <= 'z')))
			ini++;

		return ini - 1;
	}

	public static void main(String[] args) {
		char[][] matriz = {
				{ '#', 'L', 'a', ' ', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ',', ' ', '-', '#', '/', ' ', '#',
						' ', '-', '/', '#', ' ', '/', '-', ' ', '#', ' ', '#', '/', '-', ' ', '#', '-', '/', ' ', '#',
						' ', '-', '/' },
				{ '-', 'L', 'a', ' ', 'p', 'u', 'e', 'r', 't', 'a', ' ', 'b', 'l', 'a', 'n', 'c', 'a', ',', ' ', '/',
						'-', ' ', '#', ' ', '#', '/', '#', ' ', '-', ' ', '#', '-', '#', ' ', '/', '#', ' ', '/', '-',
						' ', '#', '/' },
				{ '/', 'E', 'l', ' ', 'j', 'a', 'r', 'd', 'i', 'n', ' ', 'v', 'e', 'r', 'd', 'e', ' ', ' ', ' ', ' ',
						' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', ' ' },
				{ '-', 'y', ' ', 't', 'u', ' ', 'h', 'e', 'r', 'm', 'a', 'n', 'a', ' ', 'e', 'n', ' ', 'b', 'o', 'l',
						'a', 's', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', ' ' } };

		char[] arrC = { 'l', 'p', 'm', 'p', 'n' };

		recorrerMatriz(matriz, arrC);

	}

}
    

