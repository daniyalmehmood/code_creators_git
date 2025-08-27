//Logic-2 > makeBricks

public class BrickBuilder {
    public boolean canBuildGoal(int small, int big, int goal) {
        int totalOfBig = big * 5;
        int finalresult = 0;
        if (totalOfBig == goal) {
            return true;
        }
        if (totalOfBig > goal) {
            int howMuchBig = goal / 5;
            finalresult = howMuchBig * 5;
            return (goal - finalresult) <= small;
        }
        if (finalresult <= goal) {
            if (totalOfBig < goal) {
                return (goal - totalOfBig) <= small;
            }
        }

        return false;
    }
}