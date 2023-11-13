package net.learning.java;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEnumerate {

    public static void main(String[] args) {
        // Creating an empty hashtable 
        Hashtable<Integer, String> hash = new Hashtable<Integer, String>(); 
  
        // Inserting key-value pairs into hash table 
        // using put() method 
        hash.put(1, "Geeks"); 
        hash.put(2, "for"); 
        hash.put(3, "Geeks"); 
  
        // Now creating an Enumeration object to read elements 
        Enumeration<String> e = hash.elements(); 
  
        // Condition holds true till there is single key remaining 
  
        // Printing elements of hashtable using enumeration 
        while (e.hasMoreElements()) {   
            // Printing the current element 
            System.out.println(e.nextElement()); 
        } 
    }
    
}
