package net.learning.java.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
        String strs[] = {"flower", "flow", "floss", "flowers"}; //{"dog", "cat", "rat", "mat"}; //
        String prefix = longestCommonPrefix(strs);
        System.out.println("longest prefix "+prefix);
    }
    
    public static String longestCommonPrefixBySorting1(String[] strArray) {
		StringBuilder commonPrefix = new StringBuilder();
		Arrays.sort(strArray);
		if(strArray.length > 0) {
			String first = strArray[0];
			String last = strArray[strArray.length -1];
			for(int i=0; i<Math.min(first.length(), last.length()); i++) {
				if(first.charAt(i) == last.charAt(i)) {
					commonPrefix.append(first.charAt(i));
				} else
					break;
			}
		} 
		return commonPrefix.toString();
		
	}
	
	public static String longestCommonPrefixBySorting2(String[] strs) {
		Arrays.sort(strs);
		String commonPrefix = "";
		if(strs.length > 0) {
			String firstStr = strs[0];
			String lastStr = strs[strs.length -1];
			int idx = 0;
			while(idx < Math.min(firstStr.length(), lastStr.length())) {
				if(firstStr.charAt(idx) == lastStr.charAt(idx)) {
					idx++;
				}else break;
			} 
			commonPrefix = firstStr.substring(0, idx);
		} 
		return commonPrefix;
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";
		if(strs == null | strs.length == 0) return prefix;
		
		prefix = strs[0]; //assume that first string is the longest common prefix
		
		//start checking with second string from array
		for(int i=1; i<strs.length && prefix.trim().length() > 0; i++) {
			System.out.println("outer loop: array element "+strs[i]);
			System.out.println("outer loop: prefix to start "+prefix);
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() -1);
				System.out.println("inner loop: new prefix "+prefix);
			}				
		}
				
		return prefix;
	}
	
	
	

}
