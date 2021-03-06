package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays2D{
	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int sum = 0;
		int i = 0;
		int j = 0;
		int maxSum = -64;

		int initial_i = 0;
		int final_i = 3;
		int initial_j = 0;
		int final_j = 3;
//de dentro a fuera, primero se comprueba la primera plantilla posible, desde [0] [0]
//se desplaza por i = 0, 3 veces
//se desplaza por filas 0, 1, 2, 3...para las plantillas que permiten el tama�o de la matriz

		for (int l = 0; l < 4; l++) {
			for (int k = 0; k < 4; k++) {
				for (i = initial_i; i < final_i; i++) {
					for (j = initial_j; j < final_j; j++) {
						if (!(i == initial_i + 1 && (j == initial_j || j == initial_j + 2))) {
							sum = sum + arr[i][j];
						}
					}
				}
				if (sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
				initial_j++;
				final_j++;
			}
			initial_i++;
			final_i++;
			initial_j = 0;
			final_j = 3;
		}
		return maxSum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
