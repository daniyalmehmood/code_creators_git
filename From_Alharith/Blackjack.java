public class Blackjack {

    public int getWinningScore(int a, int b) {
        if ((a<=21 && a>b)|| (b>21 && a<=21) )
            return a;
        if ((b<=21 && a<b) || (a>21 && b<=21)) return b;
        return 0;
    }

}
