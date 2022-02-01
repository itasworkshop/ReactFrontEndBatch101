package org.example;

import java.util.*;

class Student3{

    private int rollno;
    private String name;

    public Student3(int rollno, String name) {
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
        if (this.getRollno() == ((Student3)o).getRollno()){
            return true;
        }else{
            return false;
        }
    }

    public int hashCode(){
        return getRollno()*5;
    }
}
public class TestCollection {
    public static void main( String[] args ){

        Student3 st1 = new Student3(101,"Ajay");
        Student3 st2 = new Student3(102,"Raj");
        Student3 st3 = new Student3(101,"Suraj");

        //collection -- collection of objects
        //List,Set,Map and Queue
        //List --> list of items, we care about index
        //List --> ArrayList,LinkedList and Vector(thread safety)

        //Set --> unique items
        Set<Student3> myset1 = new HashSet<Student3>();
        myset1.add(st1);
        myset1.add(st3);
        myset1.add(st2);

        List<Student3> mylist1 = new ArrayList<Student3>();
        mylist1.add(st2);
        mylist1.add(st1);
        mylist1.add(st3);

        List<Student3> mylist2 = new Vector<Student3>();
        mylist2.add(st1);
        mylist2.add(st2);
        mylist2.add(st3);

        List<Student3> mylist3 = new LinkedList<Student3>();
        mylist3.add(st2);
        mylist3.add(st1);
        mylist3.add(st3);

       System.out.println(mylist1);
       System.out.println(myset1);
    }

}
