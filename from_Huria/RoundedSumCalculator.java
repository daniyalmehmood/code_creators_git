public class RoundedSumCalculator {
    public static int calculateRoundedSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int reminder = num % 10;
        if (reminder >= 5) {
            return num + (10 - reminder);
        }
        return num - reminder;
    }

    public static void main(String[] args) {
        System.out.println(calculateRoundedSum(16, 17, 18));
        System.out.println(calculateRoundedSum(12, 13, 14));
        System.out.println(calculateRoundedSum(6, 4, 4));
    }
}
