public class BricksBuilder {
    public static boolean canBuildBricks(int small, int big, int goal) {
        int bigBricksLength = big * 5;
        int usedBigBricks = Math.min(goal / 5, big);
        int remainingLength = goal - (usedBigBricks * 5);
        return small >= remainingLength;
    }
    public static void main(String[] args) {
        System.out.println(canBuildBricks(3, 1, 8));
        System.out.println(canBuildBricks(3, 1, 9) );
        System.out.println(canBuildBricks(3, 2, 10));
    }
}
