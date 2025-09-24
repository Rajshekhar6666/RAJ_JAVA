abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadOverrideAbstract {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of int: " + c.add(5, 10));
        System.out.println("Sum of double: " + c.add(5.5, 2.5));

        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
