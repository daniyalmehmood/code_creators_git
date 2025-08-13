public class BlackJackScoreEvaluator {
    public static void main(String[] args) {
        System.out.println(calculateBlackJackScore(19, 21));// → 21
        System.out.println(calculateBlackJackScore(21, 19));// → 21
        System.out.println(calculateBlackJackScore(19, 22));// → 19
    }
    public static int calculateBlackJackScore(int a, int b) {
        if (a == 21 || b == 21) {
            return 21;
        }
        else if (a < 21 && b < 21) {
            return Math.max(a, b);
        }
        else if (a > 21 && b > 21) {
            return 0;
        }
        else if (a > 21) {
            return b;
        }
        return a;
    }
}
