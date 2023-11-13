package net.learning.java;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExcepTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("500");
		list.add("600");
		list.add("700");
		list.add("800");
		list.add("900");
		list.add("1000");
		
		for(int i= 0; i<list.size(); i++) {
			if(list.get(i).equals("600")) {
				list.remove(i);
			}
		}
		
		System.out.println("List after removal: "+list);
		
		List<String> list1 = new ArrayList<>();
		list1.add("500");
		list1.add("600");
		list1.add("700");
		list1.add("800");
		list1.add("900");
		list1.add("1000");
		
		for(String s : list1) {
			if(s.equals("600")) {
				list1.remove(s);
			}
		}
		
		System.out.println("List after removal: "+list1);
	}
}
