package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array_Manipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		long res = 0;
		int[] result = new int[n];

		Arrays.fill(result, 0);

		for (int j : result) {

			System.out.print(j + " ");
		}
		System.out.println();

		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];

			System.out.print(a + " " + b + " " + k);
			System.out.println();

			for (int j = a - 1; j < b; j++) {
				result[j] = result[j] + k;
			}

			for (int j : result) {

				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int index = 0; index < result.length; index++) {
			if (result[index] > res) {
				res = result[index];
			}
		}
		System.out.println(res);
		return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
