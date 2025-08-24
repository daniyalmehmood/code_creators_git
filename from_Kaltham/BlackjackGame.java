//Logic-2 > blackjack

public class BlackjackGame {
    public int getBestScore(int a, int b) {
        if (a <= 21 && b <= 21) {
            return Math.max(a, b);
        }
        if (a > 21 && b <= 21) {
            return b;
        }
        if (a <= 21 && b > 21) {
            return a;
        }
        return 0;
    }
}