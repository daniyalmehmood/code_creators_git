public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigUsed = Math.min(big, goal / 5);
        int needed     = goal - maxBigUsed * 5;
        return (needed >= 0 && needed <= small) ? needed : -1;
    }
}
