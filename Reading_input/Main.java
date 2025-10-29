package Reading_input;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("salary: ");
        float salary = scanner.nextFloat();
        System.out.println("You salary is: " + salary);
      

        Scanner s2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s2.nextLine().trim();
        System.out.println("you are: " + name);
        

    }
}
