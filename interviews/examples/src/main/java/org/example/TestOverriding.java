package org.example;

class Person{
    public void greetMe(){
        System.out.println("Hello from person");
    }
}

class Employee extends Person{
    public void greetMe(){
        System.out.println("Hello from employee");
    }
}

class Student1{
    public void greetMe(){
        System.out.println("Hello from student");
    }
}

public class TestOverriding {
    public static void main( String[] args ){
        Employee emp1 = new Employee();
        emp1.greetMe();
    }
}
