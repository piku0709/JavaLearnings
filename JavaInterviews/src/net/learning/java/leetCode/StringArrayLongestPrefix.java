package net.learning.java.leetCode;

public class StringArrayLongestPrefix {

    public static void main(String[] args) {
        String strs[] = {"Rat", "race", "light"};
        String prefix = longestPrefix(strs);
        System.out.println("longest prefix "+prefix);
    }
    
    static String longestPrefix(String[] strArray) {
        String prefix = "";
        char[] chArray = strArray[0].toCharArray();
        for(int i=0; i<chArray.length; i++) {
            boolean charFound = false;
            for(int j=1; j<strArray.length; j++) {
                if(strArray[j].length()>= chArray.length && 
                chArray[i] == strArray[j].charAt(i)) {
                    charFound = true;
                } else {
                    charFound = false;
                }
            }
            if(charFound) prefix = prefix+chArray[i];
        }
        return prefix;
    }
}
