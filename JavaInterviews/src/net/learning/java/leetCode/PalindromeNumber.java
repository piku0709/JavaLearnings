package net.learning.java.leetCode;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPlaindrome(-121));
	}
	
	public static boolean isPlaindrome(int x) {
		if(x < 0) {
			return false;
		}
		
		int reversed = 0;
		int temp = x;
		
		while(temp != 0) {
			int digit = temp %10;
			reversed = reversed * 10 + digit;
			temp = temp/10;
		}
		
		return (reversed == x);
	}

}
