package net.learning.java.leetCode;

public class FibonacciSequence {
    static int n1=0, n2=1;

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        //printFiboNacciWithoutRecursion(10);
        printFibonacciWithRecursion(10);
    }

    public static void printFiboNacciWithoutRecursion(int count) {
        for(int i=2; i<count; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void printFibonacciWithRecursion(int count) {
        if(count > 0) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            printFibonacciWithRecursion(count-1);
        }
    }
    
}
