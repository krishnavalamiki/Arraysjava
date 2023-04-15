package Arrays_java;

public class Assignment3 {

	public static void main(String[] args) {
		// Write a program given array find the minimum value..
		int [] a = {11,12,14,20,21,23,5};
		int min = a[0];
		for(int i = 0; i<a.length; i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minimum value of the Array:"+min);
	}

}
