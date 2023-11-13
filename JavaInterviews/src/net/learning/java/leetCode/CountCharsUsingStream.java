package net.learning.java.leetCode;

import java.util.HashMap;

public class CountCharsUsingStream {

    //Algorithm:
    //1. convert string into characters steeam
    //2. check using a filter if the character in the stream is same as the character ot be counted
    //3. count the matched characters using count function
    public static void main(String[] args) {
        String str = "Priyanka Srivastava is a developer";
        char ch = 'a';       
        System.out.println(count(str, ch));

        countAllChars(str);

    }

    public static long count(String str, char ch) {
        long count = str.chars()
        .filter(c -> (char)c == ch)
        .count();

        return count;
    }

    public static HashMap<String, Long> countAllChars(String str) {
        HashMap<String, Long> countMap = new HashMap<>();
        str.chars().forEach(c -> {
            String charStr = ""+(char)c;
            if(charStr.trim().length() > 0) {
                charStr = charStr.toUpperCase();
                if(countMap.get(charStr) != null) {
                    long count = countMap.get(charStr) + 1;
                    countMap.put(charStr, count);
                }
                else {
                    countMap.put(charStr, new Long(1));
                }
            }
        });
        System.out.println("count map "+countMap);
        return countMap;
    }
    
}
