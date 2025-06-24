// package 3-Object Oriented Programming Essentials.5-inheritance;

class parentZombie{
    String name;
    int height;
    String color;

}

class Zombie1 extends parentZombie{

    void fly(){

    }
}

class Zombie2{
    
    void walk(){

    }
}

class Zombie3{
    
    void swim(){

    }
}



public class inheritance {
    public static void main(String[] args) {
        Zombie1 z1= new Zombie1();
        z1.name="john";
        z1.fly();
    }
}
