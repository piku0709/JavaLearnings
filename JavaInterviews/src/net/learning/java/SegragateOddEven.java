package net.learning.java;

import java.util.Arrays;

public class SegragateOddEven {
	
	public static void main(String[] args) {
		int[] numbers = {12, 34, 45, 8, 9, 3, 7, 5, 6, 2};
		int left = 0;
		int right = numbers.length -1;
		int numberOfSwaps = 0;
		
		//keep all even numbers to the left of the list
		//keep all odd numbers to the right of the list
		while(left < right) {
			
			//keep increasing left index until even number is found
			while(numbers[left] % 2 == 0 && left < right)
				left++;
			
			//keep decreasing right index until odd number is found
			while(numbers[right] %2 == 1 && left < right)
				right--;
			
			//swap odd number at left index with even number at right index
			if(left < right) {
				int oddTemp = numbers[left];
				int evenTemp = numbers[right];
				
				numbers[left] = evenTemp;
				numbers[right] = oddTemp;
				numberOfSwaps++;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("number of swaps: "+numberOfSwaps);
	}

}
