package net.learning.java.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLeetCode {

    //Given an array of integers and an integer target, return 
    //indices of the two numbers such that they add up to target.
    public static void main(String[] args) {
        int[] nums = {2,7,11,5};
        int target = 9;
        int[] result = findTwoNums(nums, target);
        System.out.println("result "+Arrays.toString(result));
    }

    static int[] findTwoNums(int[] arr, int sum) {
        //put elements and their index into HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], i);
        }
        System.out.println("map "+map);

        for(int i=0; i<arr.length; i++) {
           int remainder = sum - arr[i];
           if(map.get(remainder) != null) {
            return new int[]{i, map.get(remainder)};
           }
        }

        return new int[]{};
    }
    
    
}
