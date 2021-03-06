package arrays;

import java.io.*;
import java.util.*;

public class Array_Manipulation {
	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		//initial solution O(n*m)
		/*long res = 0;
		long[] result = new long[n];

		Arrays.fill(result, 0);

		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];

			for (int j = a - 1; j < b; j++) {
				result[j] += k;
			}
		}
		//looking for max value at final array
		for (int j = 0; j<result.length;j++) {
			if(result[j] > res) {
				res= result[j];
			}
		}
		
		return res;
		*/
		
		//definitive solution O(n + m)
		long [] result = new long[n + 1];
		long sum = 0;
        long res = 0;
        
		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			//updating just these two position will be enough to get O(n + m)
			result[a-1] += k;
            result[b]   -= k;
		}
				
        for (int i = 0; i < n; i++) {
            sum += result[i];
            res = Math.max(res, sum);
        }
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
