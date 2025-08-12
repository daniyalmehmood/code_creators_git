public class NumberDivisibleChecker {
    public static void main(String[] args) {
        System.out.println(formatFizzBuzzNumber(1));// → "1!"
        System.out.println(formatFizzBuzzNumber(2));// → "2!"
        System.out.println(formatFizzBuzzNumber(3));// → "Fizz!"
    }
    public static String formatFizzBuzzNumber(int n) {
        if(n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        }
        else if (n % 5 == 0) {
            return "Buzz!";
        }
        else if(n % 3 == 0){
            return "Fizz!";
        }
        return n + "!";
    }
}
