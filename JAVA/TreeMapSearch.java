import java.util.*;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        String searchValue = "Two";
        if (map.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' found in TreeMap.");
        } else {
            System.out.println("Value not found.");
        }
    }
}

