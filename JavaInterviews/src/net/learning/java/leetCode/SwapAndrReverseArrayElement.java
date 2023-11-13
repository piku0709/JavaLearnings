package net.learning.java.leetCode;

import java.util.Arrays;

public class SwapAndrReverseArrayElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 89};
        //swap(arr, 1,2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) { // 2 pointer method
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
