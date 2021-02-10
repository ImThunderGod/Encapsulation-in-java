//ENCAPSULATION-- BINDING DATA WITH METHODS.
package com.company;
class Student{
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        //To maintain log file.
        System.out.println("Value changed");
    }

    private int rollNo;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name changed");
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(4);
        s1.setName("ANAND");
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());


    }
}
