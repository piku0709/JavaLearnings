package net.learning.java.dataStructure;

import java.util.HashMap;

public class FindPairCount {

	public static void main(String[] args) {
		int[] array = {1, 5, 7, -1, 5, 4, 2, 0, 12, 3};
		int sum = 6;
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] + array[j] == sum)
					count++;
			}
		}
		
		System.out.println("count of pairs with given sum: "+count);
		
		int count1 = findCount(array, sum);
		System.out.println("using different method - count of pairs with given sum: "+count1);
	}
	
	public static int findCount(int[] array, int sum) {
		int count = 0;
		HashMap<Integer, Integer> memberCount = new HashMap<>();
		
		//store count of array members in the given map
		for(int i=0; i<array.length; i++) {
			if(!memberCount.containsKey(array[i])) {
				memberCount.put(array[i], 1);
			} else memberCount.put(array[i], memberCount.get(array[i])+1);
		}
		
		System.out.println("membercount: " + memberCount);
		
//		for(int i=0; i<array.length; i++) {
//			if(memberCount.get(sum-array[i]) != null) {
//				count += memberCount.get(sum-array[i]);
//			}
//			if((sum-array[i]) == array[i])
//				count--;
//		}
//		count = count/2;
//		return count;
		for(int i=0; i<array.length; i++) {
			if(memberCount.get(sum-array[i]) != null) {
				System.out.println("memberCount.get(sum-array[i]) = "+array[i]);
				count = count + memberCount.get(sum-array[i]);
			}
			System.out.println("array[i] = " + array[i]);
			
			if((sum - array[i]) == array[i]) {
				System.out.println("sum-array[i] = " + array[i]);
				count = count --;
			}
		}
		
		count = count /2;
		return count;
		
	}

}
