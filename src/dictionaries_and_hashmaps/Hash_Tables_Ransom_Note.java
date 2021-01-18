package dictionaries_and_hashmaps;

//public class Hash_Tables_Ransom_Note {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hash_Tables_Ransom_Note {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		for (String s : magazine) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.print("magazine length " + magazine.length);
		System.out.println();
		for (String s : note) {
			System.out.print( s + " " );
		}
		System.out.println();
		System.out.print("note length " + note.length);
		System.out.println();
		System.out.println();
		/////////////////////////////////

		Set<String> set = new HashSet<>(Arrays.asList(magazine));

		int i = 0;
		boolean notFound= false;
		while(i < note.length && !notFound) {
			System.out.println(note[i]);
			if (!set.contains(note[i])){
				notFound = true;
			}
			System.out.println(i);
			i++;
		}
		
		
		
		
		
		if (!notFound) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
