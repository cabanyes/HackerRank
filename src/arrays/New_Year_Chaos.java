package arrays;

import java.util.*;

public class New_Year_Chaos {
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {

		int bribes = 0;

		for (int i = q.length - 1; i >= 0; i--) {
			// filter cases where there is not a bribe
			if (q[i] != i + 1) {//case there is one bribe
				if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
					swap(q, i, i - 1);
					bribes++;
				} else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
					//case there is two bribes
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
					bribes += 2;
				} else {//case there is 3 or more bribes
					System.out.println("Too chaotic ");
					return;
				}
			}

		}
		System.out.println(bribes);
	}
	//pre: a, b must be under length of arr
	//post: put value a position at position b and
	//put value b position at position a
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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
