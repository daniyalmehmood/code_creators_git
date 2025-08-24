public class FizzBuzzFormatter {
    public static String fizzBuzzFormatter(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        else if (n % 3 == 0) return "Fizz!";
        else if (n % 5 == 0) return "Buzz!";
        else return n + "!";
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzzFormatter(1));
        System.out.println(fizzBuzzFormatter(2));
        System.out.println(fizzBuzzFormatter(3));
        System.out.println(fizzBuzzFormatter(5));
        System.out.println(fizzBuzzFormatter(15));
    }
}
