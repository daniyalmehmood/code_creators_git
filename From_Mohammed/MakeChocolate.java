public class MakeChocolate {
    public int minSmallBarsNeeded(int small, int big, int goal) {
        int remain = goal % 5;
        if (goal > 5 * big + small) return -1;
        if (remain > small) return -1;
        if (big < goal / 5) remain = goal - big * 5;
        return remain;
    }
}
