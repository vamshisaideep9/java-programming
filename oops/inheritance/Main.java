package oops.inheritance;

class Shape {
    String color;
}

class Triangle extends Shape {

}


public class Main {
    
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}

//inheritence --> Accessing of one functions properties by another class/function
