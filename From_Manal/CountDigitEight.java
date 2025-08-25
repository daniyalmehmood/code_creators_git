public class CountDigitEight {

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        int remaining = n / 10;

        if (lastDigit == 8) {
            // Check if previous digit is also 8
            if (remaining % 10 == 8) {
                return 2 + count8(remaining);
            } else {
                return 1 + count8(remaining);
            }
        } else {
            return count8(remaining);
        }
    }

    public static void main(String[] args) {
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));

    }
}