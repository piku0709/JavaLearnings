package net.learning.java;

public class CurlyBraces {
	
	static int var1=0;
	int var2 = 0;
	
	static {
		var1 = 10;
		System.out.println("inside static block1, var1: "+var1);
	}
	
	{
		System.out.println("inside curly braces by themselves, var1: "+var1 +",var2: "+var2);
	}
	
	public CurlyBraces(int var2) {
		// TODO Auto-generated constructor stub
		this.var2 = var2;
		System.out.println("inside constructor, var1: "+var1 +",var2: "+var2);
	}
	
	public static void main(String[] args) {
		CurlyBraces obj = new CurlyBraces(15);
	}

}
