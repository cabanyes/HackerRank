package dictionaries_hashmaps;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Hash_Tables_Ransom_Note {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		
		/*
		boolean condition = true;
		
		Hashtable<String,Integer> mht = new Hashtable<>();
		
		for(String m : magazine) {
			
			if(mht.containsKey(m)) {
				mht.put(m, mht.get(m)+1);
			}else {
				mht.put(m,1);
			}
		}
		
		Hashtable<String,Integer> nht = new Hashtable<>();
		
		for(String n : note) {
			
			if(nht.containsKey(n)) {
				mht.put(n, nht.get(n)+1);
			}else {
				nht.put(n,1);
			}
		}
		
		for(String key : nht.keySet()) {
			if(!mht.containsKey(key)  || mht.get(key)<nht.get(key)) {
				condition = false;
				break;
			}
		}
		
		if (condition) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		Arrays.sort(magazine);
		Arrays.sort(note);
		
		Set<String> set = new HashSet<>(Arrays.asList(magazine));
		boolean found = false;
		for (String check : note) {
			if(!set.remove(check)) {
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		*/
		// for use contains and remove methods with efficiency
		Set<String> set = new HashSet<>(Arrays.asList(magazine));
		boolean found = false;

		for (int i = 0; i < note.length; i++) {
			if (!set.contains(note[i])) {
				found = true;
			}
			// if contains, delete it, because, it can not use
			// same word twice
			set.remove(note[i]);
		}

		if (!found) {
			System.out.println("Yes");
		} else {
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
