package week3.day1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = 121;
		int output = 0;
		
		int tempVariable = input;
		for(; tempVariable > 0 ; tempVariable /= 10) {
			
		int rem = tempVariable % 10;
		output = output * 10 + rem;
		
		}
			
		 // Check if the number is a palindrome
	      if (input == output) {
	            System.out.println(input + " is a Palindrome");
	        } else {
	            System.out.println(input + " is not a Palindrome");
	        }
		}
		

	}


