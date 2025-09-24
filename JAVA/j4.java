import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n = object.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = object.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        object.close();
    }
}
