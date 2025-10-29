
public class VariablesDemo {

    // Instance variable belong to each object
    int instanceVar = 10;

    // Static variable shared across all objects in the class.
    static String staticVar = "I am Static";

    public void showVariables() {
        // Local variables declared inside a method.
        int localVar = 5;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: "+ localVar);

    }

    public static void main(String[] args) {

        // Creating Object
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        //Accessing static variables direcly using class
        System.out.println("Accessing Static variables direcly using class: " + VariablesDemo.staticVar);
        
    }
}