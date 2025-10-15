import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();
        System.out.println("Iterating with Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

