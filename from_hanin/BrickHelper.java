public class BrickHelper {
    public boolean canBuildGoal(int small, int big, int goal) {
        // Use as many big bricks as possible without exceeding the goal
        int maxBigBrick = Math.min(goal / 5, big);
        // Calculate remaining length after using big bricks
        int remainingLength = goal - (maxBigBrick * 5);
        // Check if small bricks can cover the remainingLength length
        return small >= remainingLength;
    }
}



