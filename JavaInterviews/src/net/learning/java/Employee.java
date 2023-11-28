package net.learning.java;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable<Employee>, Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }
    
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = 0;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        return (this.id - o.id);
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    //this is required to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            // TODO Auto-generated method stub
            return o1.getName().compareTo(o2.getName());
            //throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
        
    };

    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            // TODO Auto-generated method stub
            return o1.getAge() - o2.getAge();
            //throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
        
    };

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            // TODO Auto-generated method stub
            return (int)(o1.getSalary() - o2.getSalary());
            //throw new UnsupportedOperationException("Unimplemented method 'compare'");
        }
        
    };
}
