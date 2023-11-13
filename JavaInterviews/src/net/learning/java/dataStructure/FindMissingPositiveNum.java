package net.learning.java.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class FindMissingPositiveNum {
	
	public static int findmIssingNum(int[] array) {
		int missingNum = 1;
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0)
				set.add(array[i]);
		}
		
		for(int i=1; i<=set.size()+1; i++) {
			if(!set.contains(i)) {
				missingNum = i;
			}
		}
		
		return missingNum;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5, 5, 1};
		int missingNum = findmIssingNum(array);
		System.out.println("Minimum missing positive numner: "+missingNum);
	}

}
