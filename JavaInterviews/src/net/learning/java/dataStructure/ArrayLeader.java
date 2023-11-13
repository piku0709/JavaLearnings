package net.learning.java.dataStructure;

public class ArrayLeader {
	
	public static void printLeaders(int[] array, int size) {
		for(int i=0; i<size; i++) {
			int j;
			for(j=i+1; j<size; j++) {
				if(array[i] <= array[j]) {
					break;
				}
			}
			if(j == size) {//loop did not break
				System.out.print(array[i]+" ");
			}
		}
	}
	
	public static void printLeadersfromRightmost(int[] array, int size) {
		int rightMost = array[size-1];
		//right most element is always leader
		System.out.print(rightMost + " ");
		
		for(int i=size-2; i>=0; i--) {
			if(array[i] > rightMost) {
				rightMost = array[i];
				System.out.print(rightMost + " ");
			}
		}
	}
	
	public static void main(String[] args) {
        int array[] = new int[]{16, 17, 4, 3, 5, 2}; 
        int size = array.length; 
        printLeaders(array, size); 
        System.out.println();
        printLeadersfromRightmost(array, size);
	}
	
	

}
