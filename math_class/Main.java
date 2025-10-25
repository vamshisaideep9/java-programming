package math_class;

public class Main {
    
    public static void main(String[] args) {
        
        int result = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F);
        int result3 = (int)Math.floor(1.1F);
        int result4 = Math.max(result2, result3);
        int result5 = Math.min(result3, result4);
        int result6 = (int)Math.round(Math.random() * 100);

        System.out.println(result);
        System.out.println(" ");
        System.out.println(result2);
        System.out.println(" ");
        System.out.println(result3);
        System.out.println(" ");
        System.out.println(result4);
        System.out.println(" ");
        System.out.println(result5);
        System.out.println(" ");
        System.out.println(result6);
        System.out.println(" ");

    }
}
