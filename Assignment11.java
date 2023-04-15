package Arrays_java;

public class Assignment11 {

	public static void main(String[] args) {
		// write program given array remove the duplicate and print the values..
		int a [] = {1,1,1,2,2,2,3,3,3,4,4,4,6,7};
		for(int i = 0; i<a.length; i++) {
			if(i!=a.length-1) {
				if(a[i]!=a[i+1]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
