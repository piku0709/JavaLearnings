package net.learning.java.leetCode;

import java.util.HashMap;

public class RomanToInteger {
	
	static int romanToInt(String str) {
		int answer = 0;
		
		HashMap<Character, Integer> romanIntMap = new HashMap<Character, Integer>();
		romanIntMap.put('I', 1);
		romanIntMap.put('V', 5);
		romanIntMap.put('X', 10);
		romanIntMap.put('L', 50);
		romanIntMap.put('C', 100);
		romanIntMap.put('D', 500);
		romanIntMap.put('M', 1000);
		
		for(int i=0; i< str.length(); i++) {
			if( i < str.length()-1 
					&& romanIntMap.get(str.charAt(i)) < romanIntMap.get(str.charAt(i+1))) {
				answer = answer - romanIntMap.get(str.charAt(i));
			} else {
				answer = answer +romanIntMap.get(str.charAt(i));
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

}
