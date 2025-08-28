public class FizzStringEvaluator {
    public String fizzString(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar == 'f' && lastChar == 'b') {
            return "FizzBuzz";
        }
        if (firstChar == 'f') {
            return "Fizz";
        }
        if (lastChar == 'b') {
            return "Buzz";
        }
        return str;
    }
}
