package Arrays_java;

public class Assignment2 {

	public static void main(String[] args) {
		// Write a program find the maximum values of array..
		int [] a = {1,2,33,4,32,3,6};
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Max value of Array is:"+max);

	}

}
