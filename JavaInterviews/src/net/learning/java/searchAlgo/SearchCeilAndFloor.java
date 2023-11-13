package net.learning.java.searchAlgo;

import java.util.Arrays;

public class SearchCeilAndFloor {
    public static int ceil(int[] arr, int key) {
        System.out.println("find index of key "+key+" in array "+Arrays.toString(arr));

        int low = 0, high = arr.length -1, mid = 0;

        while(low <= high) {
            mid = (low + high)/2;
            if(key == arr[mid]) {
                return arr[mid];
            } else if(key < arr[mid]) {
                high = mid - 1;
                //low = low
            } else {
                low = mid + 1;
                //high = high
            }
        }
        if(low < arr.length) return arr[low];
        else return -1;
    }

    public static int floor(int[] arr, int key) {
        System.out.println("find index of key "+key+" in array "+Arrays.toString(arr));

        int low = 0, high = arr.length -1, mid = 0;

        while(low <= high) {
            mid = (low + high)/2;
            if(key == arr[mid]) {
                return arr[mid];
            } else if(key < arr[mid]) {
                high = mid - 1;
                //low = low
            } else {
                low = mid + 1;
                //high = high
            }
        }
        if(high >= 0) return arr[high];
        else return -1;
    }

    public static void main(String[] args) {
        int[] arr = {19, 23, 56, 61, 72, 88, 92};
        int key = 72;
        System.out.println(ceil(arr, 98));
        System.out.println(floor(arr, 18));
    }
}
