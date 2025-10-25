package primitive_types.reference_types;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        byte age = 30; // No need to allocate memory
        Date now = new Date(); // always allocate memory when dealing with reference types
        System.out.println(now);
    }
}
