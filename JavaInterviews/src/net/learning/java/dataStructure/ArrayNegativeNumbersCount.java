package net.learning.java.dataStructure;

import java.util.Arrays;

public class ArrayNegativeNumbersCount {
	
	public static int segregateNegatives(int[] array) {
		int negNumCount = 0;
		
		//sort array to bring all negative numbers including zero at the left of array
		for(int i=0; i < array.length; i++) {
			if(array[i] <= 0) {
				negNumCount++;
			}
		}		
		return negNumCount;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,-3,3,-1,0,5,6};
		Arrays.sort(array);
		int negNumCount = segregateNegatives(array);
		System.out.println(Arrays.toString(array));
		System.out.println("count of negative integers in array: "+negNumCount);
	}

}
