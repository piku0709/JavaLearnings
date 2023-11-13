package net.learning.java.dataStructure;

public class PrintNumbers {
	
	public static void print(int n, int i) {
		if(i <= n) {
			String printString = "";			
			if(i % 2 == 0) printString = "Codility";
			if(i % 3 == 0) printString = printString + "Test";
			if(i % 5 == 0) printString = printString + "Coders";
			if(printString.isEmpty())
				printString = String.valueOf(i);
			System.out.println(printString);			
		}			
		
		if(i < n)
			print(n, i+1);		
	}
	
	public static void main(String[] args) {
		print(10, 1);
	}

}
