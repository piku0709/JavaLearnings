package net.learning.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchList {
	
	public static void main(String[] args) {
		//list 1 = [4,5,7,6,2,3,1}
		//list 2 = {6,5,7,4}
		//create a new list with count of numbers in list 1 which are lesser than or equal to numbers in list 2
		
		List<Integer> numsList = new ArrayList<>();
		numsList.add(4);
		numsList.add(5);
		numsList.add(7);
		numsList.add(6);
		numsList.add(2);
		numsList.add(3);
		numsList.add(1);
		
		List<Integer> maxesList = new ArrayList<>();
		maxesList.add(5);
		maxesList.add(7);
		maxesList.add(4);
		maxesList.add(3);
		
		//sort the numsList
		Collections.sort(numsList);
		System.out.println("nums list: "+numsList);
		
		//sort maxesList
		Collections.sort(maxesList);
		System.out.println("maxes list: "+maxesList);
		
		List<Integer> output = new ArrayList<>();
		
		//binarySearch the list numsList for numbers in maxesList
		for(int max : maxesList) {
			int index = Collections.binarySearch(numsList, max);
			System.out.println(max + " found at index: "+ index);
			//returns -insertion point -1 if number is not found
			//The insertion point is defined as the point at which the key 
			//would be inserted into the list.
			if(index <= -1) {
				index = -(index+1);
				output.add(index);
			} else {
				output.add(index+1);
			}
			
		}
		
		System.out.println("outputs list: "+output);
	}

}
