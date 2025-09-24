class Number {
    private double num;

    Number(double num) {
        this.num = num;
    }

    public boolean isZero() {
        return num == 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public boolean isPrime() {
        if (num <= 1 || num != (int) num) return false;
        for (int i = 2; i < num/2; i++) {
            if ((int) num % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        if (num != (int) num) return false; // Armstrong works only for integers
        int number = (int) num;
        int original = number, sum = 0, digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Number n = new Number(153);

        System.out.println("Zero = " + n.isZero());
        System.out.println("Positive = " + n.isPositive());
        System.out.println("Negative = " + n.isNegative());
        System.out.println("Odd = " + n.isOdd());
        System.out.println("Even = " + n.isEven());
        System.out.println("Prime = " + n.isPrime());
        System.out.println("Armstrong = " + n.isArmstrong());
    }
}
