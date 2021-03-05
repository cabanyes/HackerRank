package sherlock_and_anagrams;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abba";
		
		Character c;	
		String aux = "";
		
		String str;
		StringBuffer sb;
		String substring_reverse;// = sb.reverse().toString();
		int count = 0;
		 
		if (hasDuplicates(s)) {
			for (int i = 0; i < s.length()-1; i++) {
				//for (int j = 1; j< s.length()-1;j++) {
										
					c= s.charAt(i);
					aux = aux.concat(c.toString());
					str = s.substring(i+1, s.length());
					
					
					if(str.contains(aux)) {
						System.out.print(aux);System.out.println("  " + str);
						count++;
					}
					
					//aux = aux.concat(c.toString());
					
					
					
					
					
					//System.out.println("  " + str);
					
					
					
					
					/*
					
					sb = new StringBuffer(str);
					substring_reverse = sb.reverse().toString();
					
					System.out.println("   " + substring_reverse);	
				
				if(substring_reverse.contains((aux))) {
					count++;
				}
				*/
		
			}
		}
					
		System.out.println(count);
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

	class Pair<T1, T2> {
		private T1 first;
		private T2 second;

		public Pair(T1 i, T2 j) {
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
}
