public class BrickCalculator {
    public boolean canMakeGoalWithBricks(int small, int big, int goal) {
        // Calculate how many big bricks can be used (each big brick is worth 5)
        int bigUsed = Math.min(big, goal / 5);
        // Calculate how many small bricks are needed to cover the remaining goal
        int smallUsed = goal - (bigUsed * 5);
        // Check if there are enough small bricks to cover the remaining goal
        return small >= smallUsed;
    }
}
