import java.util.*;

public class InsertArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("D");

        // Insert at first position (index 0)
        list.add(0, "A");

        System.out.println("ArrayList after insertion: " + list);
    }
}

