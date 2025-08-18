public class MakeBricks {
    public boolean canMakeGoalWithBricks(int small, int big, int goal) {
        int newSmall = 1 * small;
        int newBig = 5 * big;
        int result = 0;
        if (newBig == goal) {
            return true;
        }
        if (newBig > goal) {
            result = goal / 5;
            result = result * 5;
            return (goal - result) <= small;
        }
        if (newBig < goal) {
            return (goal - newBig) <= small;
        }
        return false;
    }

}

