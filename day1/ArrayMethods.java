package week3.day1;

public class ArrayMethods {

	public static void main(String[] args) {
		
	//**** Intersection of array values *****
		int num[]= {3,4,6,5,8};
		int num1[]= {4,5,1,6,7};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if(num[i]==num1[j]) {
					System.out.println("Intersection is:"+ num[i]);
				}
			}
		}
		
		

	}

}
