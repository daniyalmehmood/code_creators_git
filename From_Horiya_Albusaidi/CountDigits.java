public class CountDigits {
    public static int countNumberOfSevenDigits(int n) {
        if (n == 0) return 0;
        if (n == 7) return 1;
        if (n % 10 == 7) {
            return 1 + countNumberOfSevenDigits(n / 10);

        }
        return countNumberOfSevenDigits(n / 10);
    }

}
