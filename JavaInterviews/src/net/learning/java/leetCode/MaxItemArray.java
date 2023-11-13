package net.learning.java.leetCode;

public class MaxItemArray {
    public static void main(String[] args) {
        int [] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(max(arr, 3, 4));
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
    
}
