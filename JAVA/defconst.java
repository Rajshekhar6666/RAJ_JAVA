public class defconst {
    int num1;
    int num2;

    public static void main(String[] args) {
        //we did not created any structure
        //a default constructor will invoke here
        defconst obj = new defconst();

        // printing the values 
        System.out.println("Value of nu1: " + obj.num1);
        System.out.println("Value of num2: " + obj.num2);
    }
}