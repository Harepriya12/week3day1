package week3.day1;

public class oddIndexToUppercase {

	public static void main(String[] args) {
		
		String test ="changeme";
		
	//  Convert the string into a character array
		char[] charArray = test.toCharArray();
		
	//  Loop through the array from end to start
		for(int i = charArray.length-1;i >= 0; i--) {
	
	//  Check if the index is odd
		if(i%2 != 0) {
			charArray[i] = Character.toUpperCase(charArray[i]); 
			
		}

	}
	// Print the character array after modification--using enhanced for loop
		for(char c: charArray) {
			System.out.print(c);
			
		}

}
}
