public class FizzStringTwo {
    public static String getFizzBuzzString(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }

    public static void main(String[] args) {
        System.out.println(getFizzBuzzString(1));
        System.out.println(getFizzBuzzString(2));
        System.out.println(getFizzBuzzString(3));
    }
}
