package collections;


public class Main {
    public static void main(String[] args) {
        var list = new GenericList<>();
        
        list.add("a");
        list.add("b");
        
        var iterator = list.iterator();

        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
