package Arrays_java;

public class Assignment6 {
	static boolean issum(int [] a, int target) {
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(a[i]+a[j]==target) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Write a program sum of two pairs equals to method..
		int a [] = {1,2,3,4,5,6,7,8};
		int target = 15;
		System.out.println(issum(a, target));
	
}
}
