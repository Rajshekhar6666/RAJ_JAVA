import java.util.*;

public class LinkedHashSetAppend {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");

        // Append element
        set.add("Cherry");

        System.out.println("LinkedHashSet: " + set);
    }
}

