//Array-2 > fizzBuzz
public class FizzBuzzChecker {
    public String[] changeNumbersToWords(int start, int end) {
        String[] NewStringArray = new String[end - start];
        for (int i = 0; i < NewStringArray.length; i++) {
            int result = i + start;
            if (result % 3 == 0 && result % 5 == 0) {
                NewStringArray[i] = "FizzBuzz";
            } else if (result % 3 == 0) {
                NewStringArray[i] = "Fizz";
            } else if (result % 5 == 0) {
                NewStringArray[i] = "Buzz";
            } else {
                NewStringArray[i] = String.valueOf(result);
            }

        }
        return NewStringArray;
    }
}