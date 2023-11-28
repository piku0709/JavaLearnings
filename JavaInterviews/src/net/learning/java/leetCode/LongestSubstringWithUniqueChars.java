package net.learning.java.leetCode;

import java.util.HashSet;
import java.util.Set;

//find the length of longest substring with non-repeating characters
//abcabcdab, abcd is the longest substring with non-repeating characters and length 4
public class LongestSubstringWithUniqueChars {
	
	public static void main(String[] args) {
		String str = "abcabcdab";
		int length = lengthOfLongestSubstring(str);
		System.out.println("lenght of longest substring: "+length);
	}
	
	public static int lengthOfLongestSubstring(String str) {
		int maxLength = 0;
		Set<Character> charSet = new HashSet<Character>();
		int left = 0;
		int n= str.length();
		for(int right=0; right<n; right++) {
			if(!charSet.contains(str.charAt(right))) {
				charSet.add(str.charAt(right));
				maxLength = Math.max(maxLength, right-left + 1);
			} else {
				while(charSet.contains(str.charAt(right))) {
					charSet.remove(str.charAt(left));
					left++;
				}
				charSet.add(str.charAt(right));
			}			
		}
		System.out.println("longest substring: "+charSet.toString());		
		return maxLength;
	}

}
