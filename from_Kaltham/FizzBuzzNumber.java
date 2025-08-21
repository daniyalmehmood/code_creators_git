//Logic-1 > fizzString2

public class FizzBuzzNumber {
    public String getFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz" + "!";
        } else if (n % 3 == 0) {
            return "Fizz" + "!";
        } else if (n % 5 == 0) {
            return "Buzz" + "!";
        }
        String result = Integer.toString(n);
        return result + "!";
    }
}