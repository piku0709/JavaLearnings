package net.learning.java;

import java.util.Scanner;

public class MultiCatchBlockTest {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String s = scnr.toString();
		int i = 0;
		
		try {
			if(s.length() > 5) {
				throw new IllegalArgumentException();
			}
			i = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			
		}
				
	}

}
