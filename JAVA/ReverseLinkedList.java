import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> it = list.descendingIterator();
        System.out.println("Reverse iteration:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

