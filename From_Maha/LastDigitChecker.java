public class LastDigitChecker {
    public boolean lastDigit(int a, int b, int c) {
        int a_digit = a % 10;
        int b_digit = b % 10;
        int c_digit = c % 10;
        return a_digit == b_digit || a_digit == c_digit || b_digit == c_digit;
    }
}
