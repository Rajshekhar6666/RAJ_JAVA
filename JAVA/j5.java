import java.util.Scanner;

public class j5 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        String original = object.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original String: " + original);
        if (original == reversed){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        object.close();
    }
    
}
