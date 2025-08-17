public class Blackjack {
    public static int getNearestToTwentyOne(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if ((a - 21) >= (b - 21)) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(getNearestToTwentyOne(19, 21));
        System.out.println(getNearestToTwentyOne(21, 19));
        System.out.println(getNearestToTwentyOne(19, 22));
    }
}
