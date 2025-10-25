package oops;

class Pen {
    String color;
    String type; // ballpoint, gel
    
    public void write() {
        System.out.println("Writing something!");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

  
}

public class OOPS {

    public static void main(String args[]) {
        //Pen pen1 = new Pen();
        
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();


        Student s1 = new Student("vamshi", 23);

        s1.printInfo();


    }


}