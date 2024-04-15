package Oops;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog scooby = new Dog();
        scooby.eat();
        scooby.color="white and dark orange";
        System.out.println(scooby.color);
        
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}
/* 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }

}
*/
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}

//heirarchical inheritance

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

