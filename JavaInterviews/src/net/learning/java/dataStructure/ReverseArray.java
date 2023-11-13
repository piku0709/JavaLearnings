package net.learning.java.dataStructure;

public class ReverseArray {
	
	public static void reverseArray(int[] array, int start, int end) {
		int temp;
		
		while(start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void reverseArrayRecursive(int[] array, int start, int end) {
		int temp;
		if(start >= end)
			return;
		temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		reverseArrayRecursive(array, start+1, end-1);
	}
	
	public static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, 6); 
        reverseArrayRecursive(arr, 0, 5); 
        System.out.println("Reversed array is "); 
        printArray(arr, 6);
	}

}
