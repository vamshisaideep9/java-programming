

public class SimpleOperatorDemo {
    
    public static void main(String[] args) {
        
        int a = 10, b= 3;

        // Aritmetic Operators
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a > b ? " + (a>b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));

        // Assignment operator
        a += 5;
        System.out.println("a after += 5 : " + a);

        // Ternary Operator
        int max = (a>b) ? a:b;
        System.out.println("Maximum: " + max);
        
    }
}
