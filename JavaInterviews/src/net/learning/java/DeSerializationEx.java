package net.learning.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
	
	public static void main(String[] args) {
		
		try {
			//Creating a stream to read the object    
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/MyWorkspace-eclipse/JavaLearnings/JavaInterviews/src/resources/employee.txt"));
			Employee e= (Employee)in.readObject();    
			//prints the data of the serialized object    
			System.out.println(e.getId()+" "+e.getName());    
			//closing the input stream    
			in.close();   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    
		
	}

}
