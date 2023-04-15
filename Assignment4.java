package Arrays_java;

public class Assignment4 {

	public static void main(String[] args) {
		// Write a program sum of the array...
		int [] a = {1,2,3,4,5,6,7};
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of the array:"+sum);
	}

}
