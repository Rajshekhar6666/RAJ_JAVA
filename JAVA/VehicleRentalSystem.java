abstract class Vehicle {
    protected double rentPerDay;
    protected String vehicleNumber;

    public Vehicle(double rentPerDay, String vehicleNumber) {
        this.rentPerDay = rentPerDay;
        this.vehicleNumber = vehicleNumber;
    }

    public abstract double calculateRent(int days);
    public abstract void displayDetails();
}

class Car extends Vehicle {
    public Car(double rentPerDay, String vehicleNumber) {
        super(rentPerDay, vehicleNumber);
    }

    @Override
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car - Number: " + vehicleNumber);
    }
}

class Bike extends Vehicle {
    public Bike(double rentPerDay, String vehicleNumber) {
        super(rentPerDay, vehicleNumber);
    }

    @Override
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike - Number: " + vehicleNumber);
    }
}

class Truck extends Vehicle {
    public Truck(double rentPerDay, String vehicleNumber) {
        super(rentPerDay, vehicleNumber);
    }

    @Override
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck - Number: " + vehicleNumber);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(2000, "CAR123");
        Vehicle bike = new Bike(500, "BIKE456");
        Vehicle truck = new Truck(3000, "TRUCK789");

        int days = 3;

        car.displayDetails();
        System.out.println("Rent for " + days + " days: " + car.calculateRent(days));

        bike.displayDetails();
        System.out.println("Rent for " + days + " days: " + bike.calculateRent(days));

        truck.displayDetails();
        System.out.println("Rent for " + days + " days: " + truck.calculateRent(days));
    }
}
