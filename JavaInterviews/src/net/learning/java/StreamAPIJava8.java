package net.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIJava8 {
	
	public static void main(String[] args) {
		Map<String, String> budget = new HashMap<>();
		budget.put("clothes", "1500");
		budget.put("grocery", "400");
		budget.put("school", "3000");
		budget.put("commute", "300");
		budget.put("rent", "2500");
		budget.put("bills", "500");
		budget.put("insurance", "300");
		
		System.out.println("map without sorting: "+budget);
		
		Map<String, String> sorted = new LinkedHashMap<>();
		
		sorted = budget
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(
						Collectors.toMap(
								e -> e.getKey(), e -> e.getValue(),
								(e1, e2) -> e2, LinkedHashMap :: new));
		
		System.out.println("sorted by key: "+sorted);
		
		sorted = budget
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry:: getValue, 
				(e1, e2) -> e2, 
				LinkedHashMap:: new));		
		
		System.out.println("sorted by value: "+sorted);
		
		List<String> list = new ArrayList<>();
		list.add("500");
		list.add("600");
		list.add("700");
		list.add("800");
		list.add("900");
		list.add("1000");
		
		System.out.println("list of strings: "+list);
		
		List<Integer> list1 = new ArrayList<>();
		
		list1 = list.stream()
				.map(s -> Integer.parseInt(s)*2)
				.collect(Collectors.toList());
		
		System.out.println("list of integer: "+list1);
		
		List<Boolean> list2 = new ArrayList<>();
		list2 = list1.stream()
				.map(p -> p > 1200)
				.collect(Collectors.toList());
		System.out.println("list of booleans: "+list2);
		
		list1 = list1.stream()
				.filter(p -> p > 1200)
				.collect(Collectors.toList());
		System.out.println("list of filtered integers: "+list1);		
		
		long count = list1.stream()
					.filter(p -> p > 1200)
					.count();
		System.out.println("count of filtered integers: "+count);
		
		List<String> list3 = new ArrayList<>();
		list3.add("t");
		list3.add("a");
		list3.add("b");
		list3.add("c");
		list3.add("a");
		list3.add("b");
		
		System.out.println("list of strings: "+list3);
		
		list3 = list3.stream()
				//.map(p -> p.toUpperCase())
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("list of distinct strings: "+list3);
		
		List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
		list4.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
