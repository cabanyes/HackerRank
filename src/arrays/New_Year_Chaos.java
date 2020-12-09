package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class New_Year_Chaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		
		// convert array to list
		List<Integer> result = new ArrayList<Integer>();
		//System.out.println();
		
		  for(int i = 0; i< q.length;i++) { 
			  //System.out.print(q[i] +		  "  ");
			  }
		 
			//System.out.println();
		
		// array to List
		for (int i = 0; i < q.length; i++) {
			result.add(q[i]);
		}

		// showing list
		for (int i = 0; i < q.length; i++) {
			//System.out.print(result.get(i) + "  ");
		}
		//System.out.println();
////////////////////////////////////////////////////////////////////////////////////
		boolean isChaotic = false;
		int bribes = 0;
		int i = result.size()-1 ;
		int k = result.size();
		// System.out.println("valor de i " +i);
		while (i > 0) {
			// System.out.println("valor get["+i+ "] = " + result.get(i));
			int expected = result.indexOf(k);
			//System.out.println("position expected " + expected);
			//System.out.println("valor de i " + i);
			//System.out.println();
			if (result.get(i) != i + 1) {
						//4	     3 + 1 =4
				//System.out.println("(i - expected)= " + (i - expected));
				if (i - expected > 2) {
				    //5-4	
					System.out.println("Too chaotic ");
					isChaotic = true;
					break;
				} else if (i - expected >0) {
					// result.add(result.get(expected));
					// System.out.println("bribes " + bribes + " +iteratiion " + (i - expected));

					//if(< 0 i - expected < 2) {
					int pre = i - expected;

					//System.out.println("pre  " + pre);
					bribes = bribes + pre;
					//System.out.println("i " + i + " + expected " + expected);
					
					
					//System.out.println(bribes);
					// showing list
					// System.out.println ();
					// System.out.println ();
					/*
					 * for(int j = 0;j<k;j++) { System.out.print(result.get(j) + "  "); }
					 */
				}
			}
				result.remove(expected);
				for (int j = 0; j < k-1; j++) {
					//System.out.print(result.get(j) + "  ");
				}
				
				//System.out.println();
				k = result.size();
				
			
			i--;
			//System.out.println();
		}

		if (!isChaotic) {
			System.out.println(bribes);
		}
		// System.out.println("fin de la funcion");

	
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
			//System.out.println("llamada minimum");
		}
		 //System.out.println("fin del programa");
		scanner.close();
	}
}
