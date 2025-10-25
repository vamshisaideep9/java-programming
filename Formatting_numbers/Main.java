package Formatting_numbers;

import java.text.NumberFormat;

public class Main {
    
    public static void main(String[] args) {
        // Cannot create Instance for the abstract class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        System.out.println(" ");

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);


        // Chaining multiple methods together. Method chaining.

    }
}
