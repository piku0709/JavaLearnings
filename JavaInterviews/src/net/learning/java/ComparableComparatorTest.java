package net.learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("Best");
		list.add("ADD");
		list.add("Sooo");
		list.add("Comb");
		list.add("Doggy");
		list.add("Eyes");
		list.add("Zulily");
		
		Collections.sort(list);
		System.out.println("list of string after sort: "+list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list of string after reverseorder sort: "+list);
		
		int[] intArray = {1,2,3,4,5,6,7};
		Arrays.sort(intArray);
		System.out.println("int array after sort: "+Arrays.toString(intArray));
		
		String[] strArray = {"A", "a", "B", "b", "c", "de", "def"};
		Arrays.sort(strArray);
		System.out.println("String array after sort: "+Arrays.toString(strArray));
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25);
		empArr[1] = new Employee(20, "Arun", 29);
		empArr[2] = new Employee(5, "Lisa", 35);
		empArr[3] = new Employee(1, "Pankaj", 32);
		
		Arrays.sort(empArr);
		System.out.println("Employee array after default sorting: "+Arrays.toString(empArr));
		
		//Arrays.sort(empArr, Employee.NameComparator);
		Arrays.sort(empArr, (e1, e2) -> {return e1.getName().compareTo(e2.getName());});
		System.out.println("Employee array after name sorting: "+Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("Employee array after age sorting: "+Arrays.toString(empArr));
		
	}

}
