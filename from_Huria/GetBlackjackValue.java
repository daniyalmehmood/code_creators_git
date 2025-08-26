public class GetBlackjackValue {
    public static int getblackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        if (a <= 21 && b <= 21) {
            return Math.max(a, b);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getblackjack(19, 21));
        System.out.println(getblackjack(21, 19));
        System.out.println(getblackjack(19, 22));
    }
}
