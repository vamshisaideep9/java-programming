package oops.interfaces;

interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {

}


class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on four legs");
    }   
}

public class Main {
    public static void main(String[] args) {
        
    }
}


// Interfaces cannot have constructors
// Interfaces use implements instead of extends.
// all fields in interfaces are static, public and final by default.
// all methods are public & Abstract by default
// interfaces support functionality of multiple inheritance
