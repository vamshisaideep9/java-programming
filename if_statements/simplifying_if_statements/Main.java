package if_statements.simplifying_if_statements;

public class Main {
    
    public static void main(String[] args) {
        
        int income = 120_000;
        boolean hashHighIncome = false;

        if (income>100_000) 
            hashHighIncome = true;

        System.out.println(hashHighIncome);
    }
}
