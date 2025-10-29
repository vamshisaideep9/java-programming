abstract class Ab {
    abstract void check(String name); // Abstract method
}

public class Abs extends Ab {

    @Override
    void check(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        
        Abs obj = new Abs();
        obj.check("GeeksforGeeks");
    }
}
