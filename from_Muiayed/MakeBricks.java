public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        return goal - 5 * Math.min(big, goal / 5) <= small && small + 5 * big >= goal;
    }
}
