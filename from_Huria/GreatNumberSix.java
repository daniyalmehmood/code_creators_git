public class GreatNumberSix {
    public static boolean greatNumberSix(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);
        if (a == 6 || b == 6 || sum == 6 || diff == 6) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println(greatNumberSix(6, 4));
        System.out.println(greatNumberSix(4, 5));
        System.out.println(greatNumberSix(1, 5));
    }
}