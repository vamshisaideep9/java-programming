package collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list.get(0));
    }
}
