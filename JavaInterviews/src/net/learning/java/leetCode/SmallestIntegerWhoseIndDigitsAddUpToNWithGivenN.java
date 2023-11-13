package net.learning.java.leetCode;

public class SmallestIntegerWhoseIndDigitsAddUpToNWithGivenN {

     //Create a Java programme that produces the smallest non-negative 
    //number whose individual digits add up to N given an integer N.

    public static void main(String[] args) {
        int N = 20;
        smallestNumber(N);
    }

    static int getSum(int n) {
        int sum = 0;
        while(n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    static void smallestNumber(int N) {
        int i = 1;
        while( 2 != 0) {
            if(getSum(i) == N) {
                System.out.println("Number "+i);
                break;
            }
            i++;
        }
    }
    
}
