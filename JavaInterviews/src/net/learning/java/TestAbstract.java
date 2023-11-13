package net.learning.java;

public abstract class TestAbstract {

    public abstract void testAbstract();

    public static void main(String[] args) {
        System.out.println("hey");
        TestAbstract ts = new TestAbstract() {
            public void testAbstract() {
                System.out.println("testing abstract....");
            }
        };
        ts.testAbstract();

        TestInterface.test();
    }

}