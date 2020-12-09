package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		// convert array to list
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < q.length; i++) {
			result.add(q[i]);
		}
		//Arrays.stream(array).anyMatch(x -> x == 3)) {
		boolean isChaotic = false;
		int bribes = 0;
		int i = result.size() - 1;
		int k = result.size();

		while (i > 0) {
			int expected = result.indexOf(k);
			if (result.get(i) != i + 1) {
				if (i - expected > 2) {
					System.out.println("Too chaotic ");
					isChaotic = true;
					break;
				} else if (i - expected > 0) {
					int pre = i - expected;
					bribes = bribes + pre;
				}
			}
			result.remove(expected);
			k = result.size();
			i--;
		}
		if (!isChaotic) {
			System.out.println(bribes);
		}
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

		scanner.close();
	}
}
