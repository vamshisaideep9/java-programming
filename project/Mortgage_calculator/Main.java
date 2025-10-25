package project.Mortgage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        
        scanner.close();


        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS_IN_YEAR;


        float x = (1 + monthlyInterestRate);

        double p = Math.pow(x, years * MONTHS_IN_YEAR);


        double Mortgage = principle * ((monthlyInterestRate*p)/(p-1));

        String MortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);


        System.out.println("Mortgage: " + MortgageFormatted);




        
        



    }
}
