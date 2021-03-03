package sherlock_and_anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;





public class Sherlock_and_Anagrams {
	public class Pair<T1,T2>{
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

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    	/*
    	 comprobar que s no tiene letras repetidas
    	 
    	 por cada primera letra comprobar que no exista otra,
    	 por substring comprobar que no exista un reverso
    	 
    	 
    	  
    	 */
    	
    	
    	
    	String i = "dfadad";
    	String j = " dfasdfgasdfa";
    	Pair<String,String> my_pair;
    	my_pair= new Pair<String, String>(i,j);

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
}
