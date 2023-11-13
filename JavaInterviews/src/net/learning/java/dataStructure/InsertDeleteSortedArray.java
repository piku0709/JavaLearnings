package net.learning.java.dataStructure;

public class InsertDeleteSortedArray {
	
	static int binarySearch(int[] array, int low, int high, int key) {
		if(high < low)
			return -1;
		
		int mid = (low + high )/2;
		
		if(key == array[mid]) {
			return mid;
		}
		
		if(key > array[mid]) {
			return binarySearch(array, (mid+1), high, key);
		}
		
		return binarySearch(array, low, (mid-1), key);
	}
	
	static int insertElement(int[] array, int n, int capacity, int key) {
		if(n >=  capacity) {
			return n;
		}
		
		int i;
		for(i=n-1; (i>0 && array[i] > key); i--) {
			array[i+1] = array[i];
		}
		
		array[i+1] = key;
		
		return n+1;
	}
	
	static int deleteElement(int[] array, int n, int key) {
		int index = binarySearch(array, 0, n-1, key);
		
		if(index == -1) {
			System.out.println("element not found");
			return n;
		} 
		
		for(int i=index; i<n-1; i++) 
			array[i] = array[i+1];
			
		return n-1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[20]; 
        arr[0] = 12; 
        arr[1] = 16; 
        arr[2] = 20; 
        arr[3] = 40; 
        arr[4] = 50; 
        arr[5] = 70; 
        int capacity = arr.length; 
        int n = 6; 
        int key = 26; 
  
        System.out.print("\nBefore Insertion: "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
  
        // Inserting key 
        n = insertElement(arr, n, capacity, key); 
  
        System.out.print("\nAfter Insertion: "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
        
        key = 20;
                
        //deleting key
        n = deleteElement(arr, n, key);
        
        System.out.print("\nAfter Deletion: "); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
		
	}

}
