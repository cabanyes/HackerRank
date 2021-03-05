package sherlock_and_anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Sherlock_and_Anagrams {


    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    	
    	// comprobar que s no tiene letras repetidas
    	if(hasDuplicates(s)) {
    	
    		//iniciar recorrido por s
    		//
    		Collections.reverse(Arrays.asList(s));
    		System.out.println(s);
    	}
    			
    			
    			
    	
    	
    	// por cada primera letra comprobar que no exista otra,
    	// por substring comprobar que no exista un reverso
    	 
    	 
    	  
    	 
    	
    	
    	
    	String i = "dfadad";
    	String j = " dfasdfgasdfa";
    	Sherlock_and_Anagrams x = new Sherlock_and_Anagrams();
    	Sherlock_and_Anagrams.Pair<String,String> my_pair = x.new Pair<String, String>(i,j);
    	my_pair.getFirst();
    	

return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

class Pair<T1,T2>{
	private T1 first;
	private T2 second;
	
	public Pair (T1 i, T2 j) {
		first = i;
		second = j;
	}
	
	public T1 getFirst() {
		return first;
	}
	
	public T2 getSecond() {
		return second;
	}

}
private static boolean hasDuplicates(String s) {
	boolean found = false;

	for (int i = 0; i < s.length() - 1; i++) {
		if (found) {
			break;
		}
		for (int j = i+1; j < s.length(); j++) {
			//System.out.println(s.charAt(i) + " " + s.charAt(j) + "    ");
			if (s.charAt(i) == s.charAt(j)) {
				found = true;
				break;
			}
		}
	}
	return found;
}
}