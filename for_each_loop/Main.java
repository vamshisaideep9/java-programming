package for_each_loop;

public class Main {
    
    public static void main(String[] args) {
        
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}


// Limitations:
// 1. It always forward. Cant iteratre from back
// 2. Dont have Access to index of an item.
