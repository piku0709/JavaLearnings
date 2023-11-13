package net.learning.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapCollectionView {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(0, "Welcome"); 
        hash_map.put(1, "to"); 
        hash_map.put(2, "Geeks"); 
        hash_map.put(3, "4"); 
        hash_map.put(4, "Geeks"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: "+ hash_map); 
  
        // Using values() to get the set view of values 
        System.out.println("The collection is: "+ hash_map.values()); 

        System.out.println(hash_map.size());
        System.out.println(hash_map.values().size());
        Set<String> valuesSet = new HashSet<String>();

        hash_map.values().forEach(element -> {
            System.out.println(element);
            valuesSet.add(element);
        });

        System.out.println("set "+valuesSet);
        System.out.println(valuesSet.size());
    }
}
