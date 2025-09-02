public class FizzBuzzPrinter {
    public String[] createFizzBuzzArray(int start, int end) {
        String[] fizzBuzzArray = new String[end - start];
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            fizzBuzzArray[i] = String.valueOf(start + i);
        }
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            int number = Integer.valueOf(fizzBuzzArray[i]);
            if (number % 3 == 0 && number % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (number % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (number % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = fizzBuzzArray[i];
            }
        }
        return fizzBuzzArray;
    }
}
