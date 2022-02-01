package org.example;

import java.util.Objects;

class Student2{

    private int rollno;
    private String name;

    public Student2(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //how to represent
    public String toString(){
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
       if (this.getRollno() == ((Student2)o).getRollno()){
           return true;
       }else{
           return false;
       }
    }



}

public class TestObjectMethods {
    public static void main( String[] args ){

        Student2 st2 = new Student2(101,"Rajesh");
        Student2 st3 = new Student2(101,"Raj");
        System.out.println(st2.equals(st3));
        //System.out.println("Raj".equals("raj"));

    }
}
