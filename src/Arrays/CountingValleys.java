package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {
		// Write your code here
		int level = 0;
		String res="*";
		
		for (int i = 0; i < steps; i++) {
           if(path.charAt(i) == 'D') {
        	   level = level -1;
           }else if (path.charAt(i) == 'U') {
        	   level = level + 1;
           }
          // System.out.print(level + " ");
           String aux = Integer.toString(level);
           res =res.concat(aux);
          // System.out.println("strig formada " + res);
		}
		
		
		
		//System.out.println();
		//System.out.println(res);
		//return 0;
		int total = 0;
		for (int i = 0; i < res.length()-1; i++) {
			if(res.charAt(i) == '0') {
				total = total +1;
			}
		}
		return (total);
	}

}

public class CountingValleys {
	public static void main(String[] args) throws IOException {
		String path = "DDUUDDUDUUUD";
		String path2 = "UDDDUDUU";
		System.out.println(Result.countingValleys(path2.length(), path2));
		

	}
}
