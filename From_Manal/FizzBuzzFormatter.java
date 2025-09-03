public class FizzBuzzFormatter {
    public static String formatFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz!";
        } else if (number % 3 == 0) {
            return "Fizz!";
        } else if (number % 5 == 0) {
            return "Buzz!";
        } else {
            return number + "!";
        }
    }
    public static void main(String[] args) {
        System.out.println(formatFizzBuzz(1));
        System.out.println(formatFizzBuzz(2));
        System.out.println(formatFizzBuzz(3));
    }
}