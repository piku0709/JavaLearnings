package net.learning.java.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MaxItemArray implements Cloneable{
	
	private String myName= "MaxItemArray";
	
    public static void main(String[] args) {
        int [] arr = {1, 3, 23, 9, 18, 23};
        System.out.println(max(arr));
        System.out.println(max(arr, 0, 4));
        removeDuplicateItem(arr);      
    }

    private static int max(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int maxval = arr[0]; //assuming arr is not empty
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    private static int max(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }
        int maxval = arr[0]; //assuming arr is not empty
        for(int i=start; i<= end; i++) {
            if(arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    
    private static void removeDuplicateItem(int[] arr) {
    	Set<Integer> set =  new HashSet<Integer>();
    	for(int i=0; i<arr.length; i++) {
    		set.add(arr[i]);
    	}
    	
    	int[] newArray = new int[set.size()];
    	Iterator<Integer> setItr = set.iterator();
    	int i=0;
    	while(setItr.hasNext()) {
    		newArray[i] = (setItr.next());
    		i++;
    	}
    	
    	System.out.println("new Array "+Arrays.toString(newArray));
    }
    
}
