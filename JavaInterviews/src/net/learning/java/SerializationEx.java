package net.learning.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEx {
	public static void main(String[] args) {
		//creating the object
		Employee emp = new Employee(1, "piku", 39, 1000);
		
		try {
			//Creates a stream and writes the object 
			FileOutputStream fout = new FileOutputStream("D:/MyWorkspace-eclipse/JavaLearnings/JavaInterviews/src/resources/employee.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);    
			out.writeObject(emp);    
			out.flush();    
			//closes the output stream    
			out.close(); 
			System.out.println("Successfully Created");   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    		   
		
	}
}
