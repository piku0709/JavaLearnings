package net.learning.java.leetCode;

import java.util.Arrays;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		FibonacciSeries fibSeriesObj = new FibonacciSeries();
		
		//print fibonacci series up to 10 integers
		fibSeriesObj.printFibSeries(10);
		
		//print series in recursive way
		for(int i=0; i<10; i++)
			System.out.print(fibSeriesObj.fibRecursive(i) + " ");
	}
	
	public void printFibSeries(int n) {
		int fib[] = new int[n];
		for(int i=0; i<n; i++) {
			if(i <= 1) {
				fib[i] = i;
			} else {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		System.out.println("fibonaccii series: "+Arrays.toString(fib));
	}
	
	public int fibRecursive(int i) {
		if(i <=1)
			return i;
		
		int res = fibRecursive(i-1) + fibRecursive(i-2);
		return res;
	}

}
