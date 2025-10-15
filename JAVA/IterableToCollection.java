import java.util.*;

public class IterableToCollection {
    public static void main(String[] args) {
        Iterable<String> iterable = Arrays.asList("A", "B", "C");

        // Convert Iterable to Collection (ArrayList)
        Collection<String> collection = new ArrayList<>();
        iterable.forEach(collection::add);

        System.out.println("Converted Collection: " + collection);
    }
}

