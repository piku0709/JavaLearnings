package net.learning.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest {
    public static void main(String[] args) {
        List<Integer> myList  = Arrays.asList(1,2,3,45,67,89,87,90,101);
        List<Integer> myNewList = myList.stream().map(e -> e*2).collect(Collectors.toList());
        System.out.println(Arrays.toString((myNewList.toArray())));
        myList.stream().map(e -> e*2).forEach(newE ->{
            //System.out.println(newE);
        });
        myNewList.forEach(System.out::println);
    }
    
}
