package net.learning.java;

public class FunctionalInterfaceTest {
        public static void main(String[] args) {
            int a = 5;

            //lambda expression to define calculate method
            Square s = (int x) -> x * x;
            int ans = s.calculate(a);
            System.out.println(ans);
        }
}

interface Square {
    int calculate(int x);
}
