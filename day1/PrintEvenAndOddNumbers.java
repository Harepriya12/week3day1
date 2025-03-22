package week3.day1;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int []a = {1,2,3,4,5,6};
		int evenCount =0;
		int oddCount = 0;
		int evenSum =0;
		int oddSum = 0;
		
		for(int i=0; i<a.length;i++) {
			if(a[i]%2 ==0) {
				a[i]++;
				evenCount = evenCount+1;  // counting total number of even numbers
				evenSum+= a[i];			  // counting total value of even numbers
				
				
			}else {
				
				oddCount = oddCount+1;
				oddSum+= a[i];
			}
		}
		
		System.out.println("Total number of even numbers are: "+evenCount);
		System.out.println("Total number of odd numbers are: "+oddCount);
		System.out.println("Total value of even numbers are: "+evenSum);
		System.out.println("Total value of even numbers are: "+oddSum);
		
	}

}
