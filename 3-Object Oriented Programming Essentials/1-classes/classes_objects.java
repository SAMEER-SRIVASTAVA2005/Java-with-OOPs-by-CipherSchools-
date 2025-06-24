// package 3-Object Oriented Programming Essentials.1-classes;

class Student{
    String name;
    int age;

    void printName(){
        System.out.println("The name is: "+name);
    }
    void printAge(){
        System.out.println("The age is: "+age);
    }
}

class Rectangle{
    
}

public class classes_objects {
    public static void main(String...args){

        Student s1=new Student();
        s1.name="Sam";
        s1.printName();

        s1.age=20;
        s1.printAge();
    }
}
