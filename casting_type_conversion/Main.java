package casting_type_conversion;

public class Main {
    
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);


        System.out.println(" ");

        // Explicit casting
        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);   

        System.out.println(" ");

        String d = "3"  ;
        int e = Integer.parseInt(d) + 2;
        System.out.println(e);

        System.out.println(" ");

        String f = "3.4"  ;
        double g = Double.parseDouble(f) + 2;
        System.out.println(g);
    }
}
