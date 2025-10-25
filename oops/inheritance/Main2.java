package oops.inheritance;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


class EquilateralTraingle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}


public class Main2 {
    
    public static void main(String[] args) {
        
    }
}
