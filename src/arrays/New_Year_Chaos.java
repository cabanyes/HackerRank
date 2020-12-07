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
		/*for (int index = 0; index < q.length; index++) {
			System.out.print(q[index] + " ");
		}
		System.out.println();*/

		
		/*int bribes = 0;
		// int i = 0;
boolean isChaotic=false;
		for (int i = 0; i < q.length-1 ; i++) {
			System.out.println("tratando elemento " + i);
			System.out.println(q[i] - 1 - i);
			
			
			if ((q[i] - 1 - i) == 1) {
				System.out.println("añade 1");
				bribes++;
			}

			if ((q[i] - 1 - i) == 2) {
				bribes+=2;
				System.out.println("añade 2");
			}

			if ((q[i] - 1 - i) >= 3) {
				System.out.println("Too chaotic ");
				isChaotic= true;
				 break;
				

			}
			//System.out.println(i);
		}*/

		//System.out.println();
		
		// convert array to list
				List<Integer> result = new ArrayList<Integer>();
				/*//input array
				for(int i = 0; i< q.length;i++) {
					System.out.print(q[i] + "  ");
				}
				*/
				System.out.println();
				//array to List
				for (int i = 0; i< q.length;i++) {
					result.add(q[i]);
				}

				//showing list
				for(int i = 0;i<q.length;i++) {
					System.out.print(result.get(i) + "  ");
				}
				System.out.println();
				
				boolean isChaotic = false;
				int bribes = 0;
				int i = q.length-1;
				int k=result.size();
					//System.out.println("valor de i " +i);
				while (i > -1) {
					System.out.println("valor get["+i+ "] = " + result.get(i));
					int expected = result.indexOf(k);
					System.out.println("position expected " + expected);
					if(result.get(i) != i+1) {
						
						
						
						
						if(i - expected >2) {
							System.out.println("Too chaotic ");
							isChaotic= true;
							 break;
						}else {
							//result.add(result.get(expected));
							System.out.println("bribes " + bribes + " +iteratiion " + (i - expected));
							if((i - expected) < -1) {
							bribes += (i - expected)*-1;
							}else {
								bribes += i -expected;
							}
							k--;
							System.out.println("bribes per iteration " + bribes);
							//showing list
							//System.out.println ();
							//System.out.println ();
							/*for(int j = 0;j<k;j++) {
								System.out.print(result.get(j) + "  ");
							}*/
							
						}
						
						result.remove(expected);
						for(int j = 0;j<k;j++) {
							System.out.print(result.get(j) + "  ");
						}
						System.out.println();
						
						System.out.println();
						System.out.println();
					}
					i--;
					
				}
		
		
		
		if( !isChaotic) {
		System.out.println("total bribes " + bribes);
		}
		//System.out.println("fin de la funcion");
		
		/* int ans = 0;
	        for(int i=q.length-1;i>=0;i--){
	        	System.out.println("elemento tratando " + i + " valor " + q[i]);
	            int ch_pos = q[i]-(i+1);
	            if(ch_pos>2) { 
	            	System.out.println("Too chaotic");
	            return;
	            }
	            else{
	                int st = Math.max(0,q[i]-2);
	                for(int j=st;j<i;j++){
	                	System.out.println("valor j " + q[j] + " valor i " + q[i]);
	                    if(q[j]>q[i]) {
	                    	System.out.println("sumando....");
	                    	ans++;
	                    }
	                }
	            }
	        }
	        System.out.println(ans);*/
		
		
		
		
		
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
		}
		//System.out.println("fin del programa");
		scanner.close();
	}
}
