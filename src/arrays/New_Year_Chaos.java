package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class New_Year_Chaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		for (int index = 0; index < q.length; index++) {
			System.out.print(q[index] + " ");
		}
		System.out.println();

		boolean found = false;
		int limitBribes = 3;
		int bribes = 0;
		int i = 0;

		if (q[i] == i + 1) {
			System.out.println("tratando elemento " + q[i]);
			bribes++;
		}
		if (q[i] == i + 2) {
			bribes += 2;
			System.out.println("tratando elemento " + q[i]);

		}
		if (bribes >= 3) {
			found = true;
		}

		System.out.println("bribes " + bribes);

		System.out.println("fin de la funcion");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}
		System.out.println("fin del programa");
		scanner.close();
	}
}
