package week3.day1;

import java.util.Arrays;

public class AnagramStringAssignment {

	public static void main(String[] args) {
		String s1 = "stops";
		String s2 = "potss";
		checkAnagram(s1,s2);

	}

	public static void checkAnagram(String s1,String s2) { 
		if(s1.length()==s2.length()) {
			System.out.println("Length matched");
		}else {
			System.out.println("Length mismatched");
		}
	
 // *** converting string to character array and sorting a character array *** //
		
		 char[] charArray1 = s1.toCharArray(); 
		 Arrays.sort(charArray1);
		 
		 char[] charArray2 =  s2.toCharArray();
		 Arrays.sort(charArray2);
			
	// *** 	Check if sorted arrays are equal  *** //
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram.");
		}else {
			System.out.println("The given strings are not an Anagram.");
		}
		}
		
	

}
