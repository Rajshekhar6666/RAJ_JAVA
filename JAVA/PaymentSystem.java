import java.util.Scanner;

abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCardPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class DebitCardPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

class UPIPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        PaymentMethod payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else if (choice == 2) {
            payment = new DebitCardPayment();
        } else {
            payment = new UPIPayment();
        }

        payment.pay(amount);

        sc.close();
    }
}
