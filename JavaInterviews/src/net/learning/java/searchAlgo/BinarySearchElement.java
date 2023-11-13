package net.learning.java.searchAlgo;

import java.util.Arrays;

public class BinarySearchElement {

    // public static int binarySearch(int[] arr, int key) {
    //     System.out.println("find index of key "+key+" in array "+Arrays.toString(arr));

    //     int low = 0, high = arr.length -1, mid = 0;

    //     while(low <= high) {
    //         mid = (low + high)/2;
    //         if(key == arr[mid]) {
    //             return mid;
    //         } else if(key < arr[mid]) {
    //             high = mid - 1;
    //             //low = low
    //         } else {
    //             low = mid + 1;
    //             //high = high
    //         }
    //     }

    //     return -1;
    // }

    public static int binarySearch(int[] arr, int key) {
        System.out.println("find index of key "+key+" in array "+Arrays.toString(arr));
        int start = 0, end=arr.length -1, mid = 0;
        while(start <= end) {
            mid = (start+end)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                end = mid-1;
            } 
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        System.out.println("find index of key "+key+" in array "+Arrays.toString(arr));

        for(int i=0; i<arr.length -1; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int key = 21;
        int[] arr = {3, 5, 6, 8, 12, 15, 16, 19, 21};
        //use binary search, since the list is sorted
        System.out.println(binarySearch(arr, key));
        
        int[] arr1 = {2, 7, 9, 11, 1, 3, 66, 56, 78, 23};
        int key1 = 11;
        //use linear search, since list is unsorted
        System.out.println(linearSearch(arr1, key1));
        
    }
    
}
