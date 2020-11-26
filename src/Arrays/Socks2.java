package Arrays;

import java.util.Arrays;

public class Socks2 {

	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);

		int resultado[] = new int[ar.length];

		int posicionResultados = -1;
		int valorCompara = -1;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != valorCompara) {
				posicionResultados++;
				valorCompara = ar[i];
			}
			resultado[posicionResultados] = resultado[posicionResultados] + 1;
		}
		int res = 0;
		for (int i = 0; i < resultado.length; i++) {
			res = res + resultado[i] / 2;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entrada[] = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int entrada2[] = new int[] { 1, 2, 1, 2, 1, 3, 2 };

		sockMerchant(entrada.length, entrada);
	}
}
