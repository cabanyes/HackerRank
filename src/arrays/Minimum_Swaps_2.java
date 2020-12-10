package arrays;

import java.io.*;
import java.util.*;

public class Minimum_Swaps_2 {
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	    int swaps=0;
            for(int i=0;i<arr.length;i++){
                if(i+1!=arr[i]){
                    int t=i;
                    while(arr[t]!=i+1){
                        t++;  
                    }
                    swap(arr,i,t);
                    for(int j : arr) {
                    	System.out.print(j + " ");
                    }
                    System.out.println();
                   /* int temp=arr[t];
                    arr[t]=arr[i];
                    arr[i]=temp;*/
                    swaps++;
                }
            }
            System.out.println(swaps);
            return swaps;

        }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
