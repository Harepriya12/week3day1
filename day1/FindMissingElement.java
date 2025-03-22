package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] numArray = {1,4,3,2,8,6,7};
		Arrays.sort(numArray);
		
	//*** loop iterates to the  maximum value in the sorted array. in this case max value is 8, loop runs from 1 to 7

		for(int i=1; i < numArray[numArray.length-1]; i++) {
			boolean found = false;
			
	    // Check if i is present in the array	
			
			for(int j = 0;j< numArray.length; j++) {
				if(numArray[j] == i) {
					 found = true;
					 break;
				}
			}
				
			
			if (!found) {
				System.out.println("Missing number is: " + i);	
				
			}
			
			
		}
	}
}
