package oops.Abstraction;


abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal");
    }
    public void eats() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a horse");
    }
    public void walk() {
        System.out.println("Walks on four legs!");
    }
}


class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs!");
    }
}


public class Main {
    
    public static void main(String[] args) {
        
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        // Animal animal = new Animal();
        // animal.walk();  // Runtime Error
    }

}


// Properties of Abstract class

/*
 * 1. Must be declared with an abstract keyword.
 * 2. it can have abstract and non-absract methods.
 * 3. It cannot be instantiated.
 * 4. It can have constructors and static methods also.
 * 5. It can have final methods which will force the subclass not to change the body of the method.
 */


