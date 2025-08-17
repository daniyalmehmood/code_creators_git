public class FizzStringTwo {
    public String generateFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz" + "!";
        }
        if ((n % 3) == 0) {
            return "Fizz" + "!";
        }
        if ((n % 5) == 0) {
            return "Buzz" + "!";
        }
        return n + "!";
    }
}
