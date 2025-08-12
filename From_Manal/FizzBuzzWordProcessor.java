
public class FizzBuzzWordProcessor {
    public static String getFizzBuzzResult(String word) {
        boolean startsWithF = word.startsWith("f");
        boolean endsWithB = word.endsWith("b");

        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return word;
        }
    }

    public static void main(String[] args) {
        System.out.println(getFizzBuzzResult("fig"));
        System.out.println(getFizzBuzzResult("dib"));
        System.out.println(getFizzBuzzResult("fib"));
        System.out.println(getFizzBuzzResult("hello")); 
    }
}