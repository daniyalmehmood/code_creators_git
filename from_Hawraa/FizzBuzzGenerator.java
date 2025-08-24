// Array-2 > fizzBuzz
public class FizzBuzzGenerator {
    public String[] createFizzBuzzArray(int start, int end) {
        String[] result = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - start] = "Buzz";
            } else {
                result[i - start] = String.valueOf(i);
            }
        }
        return result;
    }
}
