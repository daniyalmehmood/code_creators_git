public class FizzBuzzGenerator {
    public String[]generateFizzBuzz(int start, int end) {
        int length = end - start;
        String[]newArray = new String[length];
        for (int i = 0; i < length; i++) {
            if (start % 15 == 0) {
                newArray[i] = "FizzBuzz";

            } else if (start % 3 == 0) {
                newArray[i] = "Fizz";

            } else if (start % 5 == 0) {
                newArray[i] = "Buzz";

            } else {
                String indexToString = String.valueOf(start);
                newArray[i] = indexToString;

            }
            start++;

        }

        return newArray;
    }
}