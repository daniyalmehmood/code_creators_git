public class FizzBuzzArray {

    public static String[] fizzBuzz(int start, int end) {
        int length = end - start; // Length of the resulting array
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            int num = start + i;

            if (num % 3 == 0 && num % 5 == 0) {
                result[i] = "FizzBuzz"; // Multiples of both 3 and 5
            } else if (num % 3 == 0) {
                result[i] = "Fizz"; // Multiples of 3
            } else if (num % 5 == 0) {
                result[i] = "Buzz"; // Multiples of 5
            } else {
                result[i] = String.valueOf(num); // Other numbers
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 6)));  // ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 8)));  // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(java.util.Arrays.toString(fizzBuzz(1, 11))); // ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }
}