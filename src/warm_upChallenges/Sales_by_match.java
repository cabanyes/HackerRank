package warm_upChallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sales_by_match {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		// se ordena el array para poder hacer busqueda en él

		Arrays.sort(ar);
		// en result se guardan el número de ocurrencias de cada color diferente, se
		// crea del mismo tamaño mínimo, por si
		// todos los valores de ar son diferentes, en ese caso el número de pares de
		// calcetines sera 0.
		int result[] = new int[ar.length];

		int positionResults = -1;
		int valueCompare = -1;
		// se hace un recorrido por el array ar, cada nuevo valor que corresponde a un
		// color diferente, se añade y se incrementa en uno,
		// si ya existe solo se incrementa en uno en el array result usando el mismo
		// índice de arr
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != valueCompare) {
				positionResults++;
				valueCompare = ar[i];
			}
			result[positionResults] = result[positionResults] + 1;
		}
		// una vez hecho el recorrido por el array ar, en el array result se ha guardado
		// por cada color diferente (los indices de result)
		// el numero de veces que ha aparecido un mismo color en el array arr
		// se hace una suma acumulativa de cada valor entre 2 que representa un par de
		// calcetines
		int res = 0;
		for (int i = 0; i < result.length; i++) {
			res = res + result[i] / 2;
		}
		// la suma acumulativa es el resultado que se devuelve
		return res;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// OUTPUT_PATH se configura en Run->Run Configurations->Enviroment (eclipse)
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();

	}
}
