import java.util.*;

public class MapSize {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Number of key-value mappings: " + map.size());
    }
}

