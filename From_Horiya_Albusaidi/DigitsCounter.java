public class DigitsCounter {
    public int countEightDigits(int n) {
        if (n == 0) return 0;
        if (n == 8) return 1;
        if (n % 10 == 8) {
            int dividResult = n / 10;
            if (dividResult % 10 == 8) return 2 + countEightDigits(n / 10);
            return 1 + countEightDigits(n / 10);

        }
        return countEightDigits(n / 10);
    }

}
