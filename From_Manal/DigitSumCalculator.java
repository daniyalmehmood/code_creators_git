public class DigitSumCalculator {

    // Recursive function to calculate sum of digits
    public static int sumDigits(int number) {
        //  if number is a single digit
        if (number < 10) {
            return number;
        }

        // Last digit + sum of remaining digits
        return (number % 10) + sumDigits(number / 10);
    }

    public static void main(String[] args) {
        System.out.println("sumDigits(126) = " + sumDigits(126));
        System.out.println("sumDigits(49) = " + sumDigits(49));
        System.out.println("sumDigits(12) = " + sumDigits(12));
    }
}