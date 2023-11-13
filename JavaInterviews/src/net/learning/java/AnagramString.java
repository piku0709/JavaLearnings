package net.learning.java;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		String firstStr = "listen";
		String secondStr = "silent";
		
		boolean anagramStringsLength = true;
		if(firstStr.length() != secondStr.length())
			anagramStringsLength = false;
		System.out.println("Given strings are anagram based on length: "+anagramStringsLength);
		
		char[] firstCharArray = firstStr.toLowerCase().toCharArray();
		char[] secondCharArray = secondStr.toLowerCase().toCharArray();
		
		Arrays.sort(firstCharArray);
		Arrays.sort(secondCharArray);
		
		boolean anagramStrings = Arrays.equals(firstCharArray, secondCharArray);
		System.out.println("Given strings are anagram based on arrays comparison: "+anagramStrings);
		
		boolean result = true;
		for(char charTemp : firstCharArray) {
			if(secondStr.toLowerCase().indexOf(charTemp) == -1) {
				anagramStrings = false;
				break;
			}
		}
		
		System.out.println("Given strings are anagram based on indexOf: "+anagramStrings);
 	}

}
