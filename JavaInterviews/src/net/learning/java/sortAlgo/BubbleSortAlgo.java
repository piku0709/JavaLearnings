package net.learning.java.sortAlgo;

public class BubbleSortAlgo {

    static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = { 7, 8, 3, 1, 2};

        //bubble sort
        //ex- [2,1,3,5,4]
        // j=0, ( arr[j] > arr[j+1] , yes -> swap, [1, 2, 3, 5, 4] )
        // j=1, ( arr[j] > arr[j+1], no, [1, 2, 3, 5, 4] )
        // j=2, ( arr[j] > arr[] ,no, [1, 2, 3, 5, 4] )
        // j=3, ( arr[j] > [arr[j+1], yes, swap -> [1, 2, 3, 4, 5])

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);
    }
    
}
