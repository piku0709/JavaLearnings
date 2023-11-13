package net.learning.java.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CountArrayElementsOccurences {
    // Given an array of integers arr, return true if the number of occurrences of each value in the array is 
    // unique or false otherwise.
    // Example 1:
    // Input: arr = [1,2,2,1,1,3]
    // Output: true
    // Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    // Example 2:
    // Input: arr = [1,2]
    // Output: false
    // Example 3:
    // Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
    // Output: true
    // Constraints:
    // 1 <= arr.length <= 1000
    // -1000 <= arr[i] <= 1000
    public static void main(String[] args) {
        HashMap<Integer, Integer> countMap  = new HashMap<>();
        int[] intArray = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        Arrays.stream(intArray).forEach(element -> {
            if(countMap.get(element) != null) {
                countMap.put(element, countMap.get(element) + 1);
            } else {
                countMap.put(element, 1);
            }
        });  
        
        boolean result = countOccurence(countMap);
        System.out.println("result "+result);

    }

    private static boolean countOccurence(HashMap<Integer, Integer> countMap) {
        Set<Integer> keySet = countMap.keySet();
        int tempCount = 0;
        boolean result = true;
        for(int element: keySet) {
            int occurence = countMap.get(element);
            if (tempCount == occurence) {
                result = false;
                break;
            }                
            else {
                tempCount = occurence;
            }                
        }
        return result;
    }
}