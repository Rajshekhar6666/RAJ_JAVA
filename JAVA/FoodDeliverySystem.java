// File: FoodDeliverySystem.java
import java.util.Scanner;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of orders to place: ");
        int numOrders = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= numOrders; i++) {
            System.out.println("\n--- Enter Details for Order " + i + " ---");
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Food Item: ");
            String item = sc.nextLine();

            // Generate Order ID
            String orderId = "ORD" + i;

            // Create and start thread for each order
            OrderProcessor order = new OrderProcessor(orderId, name, item);
            order.start();

            System.out.println("📩 Order " + orderId + " is being processed in the background...");
        }

        System.out.println("\n💻 Main system is free to take more orders...");
    }
}
class OrderProcessor extends Thread {
    private String orderId;
    private String customerName;
    private String foodItem;

    public OrderProcessor(String orderId, String customerName, String foodItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void run() {
        try {
            System.out.println("🍳 Preparing order " + orderId + " for " + customerName + ": " + foodItem);
            Thread.sleep(2000); // Simulate time taken to prepare the order
            System.out.println("🚚 Order " + orderId + " for " + customerName + " is out for delivery!");
            Thread.sleep(2000); // Simulate delivery time
            System.out.println("✅ Order " + orderId + " for " + customerName + " has been delivered!");
        } catch (InterruptedException e) {
            System.out.println("❌ Order " + orderId + " was interrupted.");
        }
    }
}