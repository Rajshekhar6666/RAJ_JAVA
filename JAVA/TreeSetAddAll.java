import java.util.*;

public class TreeSetAddAll {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(2);
        set2.add(4);

        // Add all elements of set1 to set2
        set2.addAll(set1);

        System.out.println("Combined TreeSet: " + set2);
    }
}

