public class FizzStringChecker {
    public String fizzBuzzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");
//If both the "f" and "b" conditions are true, return "FizzBuzz".
        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        }  //string starts with "f" return "Fizz"
        else if (startsWithF) {

            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return str;
        }
    }
}

