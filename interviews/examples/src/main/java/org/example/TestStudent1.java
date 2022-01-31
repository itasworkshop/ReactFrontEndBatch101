package org.example;

//class -- template for creating objects
//objects -- real world entities -- state and behaviour
class Student{

    int rollno;
    String univName = "IITR"; //class variable
    String name;

    Student(String name){
        this.name = name;
    }

    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    //String name = "Rajesh"; //class variable

    public void greetMe(){
        System.out.println("Hi this is "+this.name+ " and my coll is "+this.univName);
    }

}
public class TestStudent1 {

    public static void main( String[] args ){
        Student st1 = new Student("Rajesh");
        Student st2 = new Student("Suraj");
        Student st3 = new Student(101,"Tom");
        st1.greetMe();
        st2.greetMe();
        st3.greetMe();
    }
}
