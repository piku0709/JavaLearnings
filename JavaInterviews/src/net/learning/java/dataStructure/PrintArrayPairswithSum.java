package net.learning.java.dataStructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintArrayPairswithSum {
	
	public static void printPairs(int[] array, int size, int sum) {
		int i = 0;
		int j = size -1;
	
		//sort arrays in increasing order
		Arrays.sort(array);
		
		while(i < j) {
			int temp = array[i] + array[j];
			if(temp == sum) {
				System.out.println("pairs with sum "+sum + " are "+array[i]+ ", "+array[j]);
			}
			if(temp < sum) {
				i++;
			} else {
				j--;
			}
		}
	}
	
	public static void printPairswithSumUsingSet(int[] array, int sum, int size) {
		Set<Integer> tempSet = new HashSet<>();
		
		for(int i=0; i<=size-1; i++) {
			int temp = sum - array[i];
			
			if(tempSet.contains(temp)) {
				System.out.println("pairs with sum "+sum + " are "+array[i]+ ", "+temp);
			}
			
			tempSet.add(array[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		int array[] = { 1, 4, 45, 6, 10, 8 }; 
        int sum = 16; 
        int size = array.length; 
  
        printPairs(array, size, sum);
        printPairswithSumUsingSet(array, sum, size);
	}

}
