package net.learning.java;

public class BinarySearchArray {
	
	//binary search is the way of searching a sorted array for a number
	//binary search is done by diving array into two halves
	//first given number is compared with the number in mid-index of array
	//if given number is greater than mid-index number, then
	//number is again search in right half array using binary search method
	//if given number is smaller than mid-index number, then
	//number is searched in left half of the array using binary search method
	
	public int binarySearch(int[] array, int begin, int end, int searchNumber ) {
		
		if(end >= begin) {
			int midIndex = begin + (end-1)/2;
			
			int tempNumber = array[midIndex];
			
			if(tempNumber == searchNumber) {
				return midIndex;
			}
			
			//if search number is greater than mid-index number, search in right half of the array
			if(searchNumber > tempNumber) {
				return binarySearch(array, midIndex+1, end, searchNumber);
			}
			
			//if search number is lesser than mid-index number, search in left half of the array
			if(searchNumber < tempNumber) {
				return binarySearch(array, begin, midIndex-1, searchNumber);
			}
		}
	
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		int searchNumber = 3;
		int begin = 0;
		int end = 7;
		BinarySearchArray binarySearchObj = new BinarySearchArray();
		int searchIndex = binarySearchObj.binarySearch(array, begin, end, searchNumber);
		if(searchIndex == -1)
			System.out.println("element not found");
		else
			System.out.println("element found at index: "+searchIndex);
	}

}
