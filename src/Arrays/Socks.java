package Arrays;

import java.util.Arrays;

public class Socks {

	static void sockMerchant(int n, int[] ar) {
		// recorrido
		// pos
		Arrays.sort(ar);

		int resultado[] = new int[ar.length];

		/*
		 * System.out.println("valores de entrada");
		 * 
		 * for (int i = 0; i < entrada.length; i++) { System.out.print(entrada[i] +
		 * " "); } System.out.println(); System.out.println();
		 */
		int posicionResultados = -1;
		int valorCompara = -1;
		for (int i = 0; i < ar.length; i++) {
			// System.out.println("valores de resultados");

			/*
			 * for (int k = 0; k < resultado.length; k++) { System.out.print(resultado[k] +
			 * " "); } System.out.println();
			 */
			// si [i] existe en aux
			// System.out.println("valor actual tratado " + entrada[i]);

			if (ar[i] != valorCompara) {
				// System.out.println("valor en tratamiento " + entrada[i] + " ");
				// valorCompara = entrada[i];
				// System.out.println("posicion actual index restultados " +
				// resultado[posicionResultados] + " ");
				posicionResultados++;

				// resultado[posicionResultados] = resultado[posicionResultados] + 1;
				/*
				 * System.out.println(); System.out.println("valores de resultados");
				 * 
				 * for (int k = 0; k < resultado.length; k++) { System.out.print(resultado[k] +
				 * " "); } System.out.println();
				 */
				valorCompara = ar[i];
				// posicionResultados++;
				//System.out.println();
				//System.out.println();
			}

			resultado[posicionResultados] = resultado[posicionResultados] + 1;

		}
		System.out.println("valores de resultados");

		for (int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + " ");
		}
		System.out.println();
		int res = 0;
		for (int i = 0; i < resultado.length; i++) {
			
			res= res + resultado[i]/2;
			
			System.out.print(res + " ");
		}
		
		System.out.println(res);
	}

	   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entrada[] = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int entrada2[] = new int[] { 1,2,1,2,1,3,2 };
		
		sockMerchant(entrada.length, entrada2);

	}
}

