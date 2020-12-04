package warm_upChallenges;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		/* La primera idea para resolver este ejercicio, seria crear
		 * un string de n elementos y buscar las ocurrencias de 'a'.
		 * 
		 * Para valores 'pequeños' es la solución que se muestra abajo,
		 * pero para valores de 10^3 10^5, sospecho que la funcion concat
		 * hace saltar java heap, fuera rango de memoria.
		 * 
		 * Se debe plantear una solución matematica que cuente las ocurrencias de'a' de 
		 * dentro de s, lo multiplique por n % s.lenght y añada una parte de s
		 * hasta conseguir n elementos donde buscar 'a'. Esto último se realiza
		 * sin tener que crear un string, solo realiza calculos
		 */
		
		/*long result = 0L;
		long ite = (n / (s.length() * 2)) + 1;

		System.out.println(ite);

		for (long i = 0; i < ite; i++) {
			//System.out.println(s);
			s = s.concat(s);
		}
		//System.out.println(s);

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'a') {
				result++;
			}
		}
		
		System.out.println(result.size());

		*/
		long total = 0;
		long iterations = 0;
		long countRest = 0;

		// calculate how many iterations to do to get n, for n > s.length()
		if (n > s.length()) {
			iterations = n / s.length();

			// calculate how many 'a' there is in s and * iterations
			long count = s.chars().filter(ch -> ch == 'a').count();
			total = iterations * count;

			// complete n by mod and substring if (n % iterations) == 0, do nothing

			if ((n % iterations) > 0) {
				long complete = n % iterations;

				String res = s.substring(0, (int) complete);

				// how many 'a' there is in the substring s and add to result, just once
				countRest = res.chars().filter(ch -> ch == 'a').count();
				total = total + countRest;
			}
		} else {
			//just for n < s.length()
			String res = s.substring(0, (int) n);
			countRest = res.chars().filter(ch -> ch == 'a').count();
			total = countRest;
		}
		return total;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
