package net.learning.java;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "My name is Priyanka !!!";
		System.out.println("Original String: "+str);
		
		//reverse String using StringBuffer
		String reverseStr1 = new StringBuffer(str).reverse().toString();
		System.out.println("reversed String using StringBuffer: "+reverseStr1);
		
		//reverse String using StringBuilder
		String reverseStr2 = new StringBuilder(str).reverse().toString();
		System.out.println("reversed String using StringBuilder: "+reverseStr2);
		
		//reverse String using iterative method
		String reverseStr3 = reverse(str);
		System.out.println("reversed String using iteration: "+reverseStr3);
		
		//reverse String using recursion method
		String reverseStr4 = reverseRecursion(str);
		System.out.println("reversed String using recursion: "+reverseStr4);
		
 	}
	
	private static String reverse(String str) {
		if(str == null || str.isEmpty() || str.length() < 2) {
			return str;
		}

		String reverseStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}
	
	private static String reverseRecursion(String str) {
		if(str == null || str.isEmpty() || str.length() < 2) {
			return str;
		}
		
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}
	


}
