import java.util.Scanner;

public class j1 {
    public static void main(String[] args){
        try (Scanner object = new Scanner(System.in)) {
            String username = object.nextLine();
            System.out.println("Enter username");
            System.out.println("Hello " + username);
        }
        //object.close();
    }
}
