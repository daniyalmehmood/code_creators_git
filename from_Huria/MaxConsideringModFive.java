public class MaxConsideringModFive {
    public static int maxConsideringModFive(int a, int b) {
        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }

        return Math.max(a, b);
    }

    public static void main(String[] args) {

        System.out.println(maxConsideringModFive(2, 3));
        System.out.println(maxConsideringModFive(6, 2));
        System.out.println(maxConsideringModFive(3, 2));
    }
}
