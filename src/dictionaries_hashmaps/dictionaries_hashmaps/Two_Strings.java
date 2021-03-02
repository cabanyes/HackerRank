package dictionaries_hashmaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Two_Strings {

	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {
		boolean found = false;

		List<String> list_s1 = new ArrayList<String>();

		for (int i = 0; i < s1.length(); i++) {
			list_s1.add(Character.toString(s1.charAt(i)));
			System.out.println(Character.toString(s1.charAt(i)));
		}

		int i = 0;
		while (i < s2.length() || !found) {
			List<String> list_aux = new ArrayList<>();
			System.out.println(Character.toString(s2.charAt(i)));
			if (list_s1.contains(Character.toString(s2.charAt(i)))) {
				System.out.println("si " + Character.toString(s2.charAt(i)));
				found = true;
				break;
			}

			list_aux.add(Character.toString(s2.charAt(i)));
			Arrays.asList(s2).removeAll(list_aux);
			i++;
		}

		if (found) {
			System.out.println("YES");
			return "YES";
		} else {
			System.out.println("NO");
			return "NO";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
