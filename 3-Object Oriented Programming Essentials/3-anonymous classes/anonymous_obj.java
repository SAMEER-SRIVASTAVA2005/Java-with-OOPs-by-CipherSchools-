// package 3-Object Oriented Programming Essentials.3-anonymous classes;

// import java.sql.Struct;

class Student{
    String name;

    Student(){
        System.out.println("In cons");
    }

    void print(){
        System.out.println("In print");
    }
}

public class anonymous_obj {
    public static void main(String...args){
        new Student().print();;
    }
}
