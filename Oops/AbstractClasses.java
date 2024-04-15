package Oops;

public class AbstractClasses {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse=new Mustang();
        
        
    }
}

abstract class Animal{
    String color="brown";

    Animal(){
        color="brown";
        System.out.println("Animal constructor called");;
    }

    void eat(){
        System.out.println("animal eats");
    }
    
    //abstract function 
    //can only be defined by abstract class 
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void walk(){
        System.out.println("walk on four legs");
    }
    void changeColor(){
        color="Dark Brown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walk on two legs");
    }
    void changeColor(){
        color="Yellow";
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

