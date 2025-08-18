import java.util.Arrays;

public class FizzBuzzCombinerWithArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildFizzBuzzWithArray(1, 6)));// ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(Arrays.toString(buildFizzBuzzWithArray(1, 8)));// ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(Arrays.toString(buildFizzBuzzWithArray(1, 11)));// ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }
    public static String[] buildFizzBuzzWithArray(int start, int end) {
        String[] combinedFizzBuzzToArray = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                combinedFizzBuzzToArray[i - start] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                combinedFizzBuzzToArray[i - start] = "Fizz";
            }
            else if (i % 5 == 0) {
                combinedFizzBuzzToArray[i - start] = "Buzz";
            }
            else {
                combinedFizzBuzzToArray[i - start] = String.valueOf(i);  // convert int to String
            }
        }

        return combinedFizzBuzzToArray;
    }
}