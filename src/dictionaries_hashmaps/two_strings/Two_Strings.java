package two_strings;

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
		// convert s1 and s2 to List, every char as string
		List<String> list_s1 = new ArrayList<String>();
		List<String> list_s2 = new ArrayList<String>();

		for (int i = 0; i < s1.length(); i++) {
			list_s1.add(Character.toString(s1.charAt(i)));
		}

		for (int i = 0; i < s2.length(); i++) {
			list_s2.add(Character.toString(s2.charAt(i)));
		}
		//find string by string any char of list_s2 in list_s1
		int i = 0;
		while (i < list_s2.size() && !found) {
			//List to delete any ocurrence of list_s2 in list_s1
			List<String> list_aux = new ArrayList<String>();
			
			if (list_s1.contains(list_s2.get(0))) {
				found = true;
				//if find and ocurrence, is not necesary find more
				break;
			}

			list_aux.add(list_s2.get(0));
			list_s2.removeAll(list_aux);

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
