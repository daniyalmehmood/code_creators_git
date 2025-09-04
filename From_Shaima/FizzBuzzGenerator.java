import java.util.Arrays;

public class FizzBuzzGenerator {
    public static String[] generateFizzBuzz(int start, int end) {
        int arrayLength = end - start;
        String[] fizzArray = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int num = start + i;

            if (num % 3 == 0 && num % 5 == 0) {
                fizzArray[i] = "FizzBuzz";
            } else if (num % 5 == 0) {
                fizzArray[i] = "Buzz";
            } else if (num % 3 == 0) {
                fizzArray[i] = "Fizz";
            } else {
                fizzArray[i] = String.valueOf(num);
            }
        }

        return fizzArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateFizzBuzz(1, 6)));
    }
}
