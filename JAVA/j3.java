import java.util.Scanner;

public class j3 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for (int i=0 ; i<101 ; i++){
            if (i % 2 != 0){
                count++;
                sum = sum + i;
            }
        }
        System.out.println("Count of odd numbers: " + count);
        System.out.println("Sum of odd numbers: " + sum);
        object.close();
    }
}
