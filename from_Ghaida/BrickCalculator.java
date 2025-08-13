public class BrickCalculator {
    public static void main(String[] args) {
        System.out.println(isGoalReachable(3, 1, 8));// → true
        System.out.println(isGoalReachable(3, 1, 9));// → false
        System.out.println(isGoalReachable(3, 2, 10));// → true
    }
    public static boolean isGoalReachable(int small, int big, int goal) {
        int maxBigBricks = Math.min(big, goal / 5);// Calculate the maximum length
        int remainingGoal = goal - (maxBigBricks * 5);
        // Check if we have enough small bricks
        return remainingGoal <= small;
    }
}
