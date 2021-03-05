package sherlock_and_anagrams;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "abcd";
		hasDuplicates(s);

		getAllSubstrings(s);
		
		
		
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
	
	private static ArrayList <String> getAllSubstrings(String str) {
		  int i, j;
		  ArrayList <String>  result = new ArrayList<String>();
int count= 0;
int counti= 0;		  for (i = 0; i < str.length(); i++) {
			  counti++;
		    for (j = i + 1; j < str.length() + 1; j++) {
		      count++; result.add(str.substring(i, j));
		      
		    }
		  }
		 // result.add("a");
		  for(String s: result ) {
			  System.out.println(s);
		  }
		  System.out.println(counti + " " + count);
		  System.out.println(result.size());
		  return result;
		}
	
	
	private static int  countAnagrams(int currentIndex, ArrayList<String> arr) {
		  String currentElement = arr.get(currentIndex);
		  
		  String arrRest = arr.substring(currentIndex + 1);
		  let counter = 0

		  for (let i = 0; i < arrRest.length; i++) {
		    if (currentElement.length === arrRest[i].length && isAnagram(currentElement, arrRest[i])) {
		      counter++
		    }
		  }

		 return counter
		}
	
}