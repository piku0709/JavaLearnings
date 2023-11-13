package net.learning.java.leetCode;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Abba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        boolean answer = false;
        str = str.toLowerCase();
        String revStr = "";
        for(int i=str.length() -1; i >=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr)) {
            answer = true;
        }
        return answer;
    }
    
    public static boolean palindromeWithTwoPointer(String str) {
        int start=0, end=str.length()-1;
        str = str.toLowerCase();
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
