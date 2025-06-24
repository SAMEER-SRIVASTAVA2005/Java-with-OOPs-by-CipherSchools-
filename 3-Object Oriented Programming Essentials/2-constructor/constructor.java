// package 3-Object Oriented Programming Essentials.2-constructor;

class Rectangle{
    int l,b;

    Rectangle(){
        System.out.println("From default cons");
    }
    
    Rectangle(int l,int b){
        // System.out.println("From parameterised cons");
        this.l=l;
        this.b=b;
    }

    int getArea(){
        return l*b;
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Rectangle r1=new Rectangle(4,5);

        int area_of_r1=r1.getArea();
        System.out.println(area_of_r1);
    }
}
