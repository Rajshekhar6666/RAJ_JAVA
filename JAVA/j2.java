import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n1 = object.nextInt();
        int n2 = object.nextInt();
        int n3 = object.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the largest number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the largest number");
        } else {
            System.out.println(n3 + " is the largest number");
        }
        object.close();
    }
}
