package warm_upChallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

	// Complete the repeatedString function below.
	static void repeatedString(String s, long n) {
		long result = 0L;
		
		
		//double ite = (Math.sqrt(n))/2;
		
		//System.out.println(ite);
		/*for (int i = 0; i < 7; i++) {
			s = s.concat(s);
			System.out.println(s);
		}*/
		
		while (s.length()<n) {
			
			s = s.concat(s);
			
		}
		//System.out.println(s);
		for (int i = 0; i < n; i++) {
			
			if (s.charAt(i) == 'a') {
				result++;
			}
		}

		System.out.println(result);
		
		
		

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = scanner.nextLine();
		 * 
		 * long n = scanner.nextLong();
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * long result = repeatedString(s, n);
		 * 
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 * 
		 * scanner.close();
		 * 
		 * 
		 */

		String input = "aba";
		int n = 10;
		
		String input2 = "a";
		long n2 = 1000000000000L;
		
		repeatedString(input2, n2);

	}
}
