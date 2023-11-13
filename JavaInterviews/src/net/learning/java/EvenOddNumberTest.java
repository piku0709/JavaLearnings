package net.learning.java;


public class EvenOddNumberTest {
	
	public static void main(String[] args) {
		int number = -2;
		int remainder = number%2;
		if(remainder == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
