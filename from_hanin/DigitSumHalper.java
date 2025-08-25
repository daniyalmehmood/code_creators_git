public class DigitSumHalper {
    public int addDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + addDigits(n / 10);
        }
    }

}

