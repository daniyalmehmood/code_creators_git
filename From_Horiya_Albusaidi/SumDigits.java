public class SumDigits {
    public int getSumOfNumberDigits(int n) {
        if (n == 0 || n == 1) return n;
        return n % 10 + getSumOfNumberDigits(n / 10);
    }

}
