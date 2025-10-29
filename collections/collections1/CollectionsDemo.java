package collections.collections1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "d");
        System.out.println(collection.size());
        System.out.println(collection.remove("a"));


        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[3]);

        System.out.println(stringArray[0].toUpperCase());
    }
}

