package net.learning.java;

public class TestString {
	
	public static void main(String[] args) {
		String color = "Yellow";
		System.out.println("Color in main: "+color);
		print(color);
		System.out.println("Color in main: "+color);
	}
	
	public static void print(String color) {
		color = "Red";
		System.out.println("Color in print method: "+color);
	}

}
