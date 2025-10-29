

public class CallStackExample {

    public static void D() {
        float d = 40.5f;
        System.out.println("In method D.");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C.");
    }

    public static void B() {
        int b = 20;
        C(); // Calling c
        System.out.println("In Method C.");
    }

    public static void A() {
        int a = 10;
        B();
        System.out.println("In Method A.");
    }

    public static void main(String[] args) {
        //A();
        B();
    }
    
}
