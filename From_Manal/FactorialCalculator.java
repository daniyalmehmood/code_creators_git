//Recursion-1 > factorial
public class FactorialCalculator {

    // Method to calculate the factorial of a number recursively
    public static int calculateFactorial(int number) {
        // factorial of 1 is 1
        if (number == 1) {
            return 1;
        }

        //  multiply current number by factorial of previous number
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(1));
        System.out.println(calculateFactorial(2));
        System.out.println(calculateFactorial(3));
    }
}