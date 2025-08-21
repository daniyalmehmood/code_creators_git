public class DigitSumCalculator {
    public int sumOfDigitsInString(String str) {
        int sumDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int digit = Character.digit(str.charAt(i), 10);
                sumDigits += digit;
            }
        }
        return sumDigits;
    }
}