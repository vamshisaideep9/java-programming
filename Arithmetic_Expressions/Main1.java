package Arithmetic_Expressions;

public class Main1 {
    
    public static void main(String[] args) {
        
        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(" ");
        int a = 1;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");
        int c = 1;
        c += 5; // c -= 5
        System.out.println(c);
    }
}   
