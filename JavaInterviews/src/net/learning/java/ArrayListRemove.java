package net.learning.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemove {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); 
		list.add(20); 
		list.add(30); 
		list.add(1); 
		list.add(2); 		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.remove(Integer.valueOf(20));
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next() < 2) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
