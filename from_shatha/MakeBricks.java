public class MakeBricks {
    public static boolean canBuildGoalLength(int small, int big, int goal) {
        int maxBricks = Math.min(goal / 5, big);
        int remaining = goal - (maxBricks * 5);
        return remaining <= small;
    }

    public static void main (String[] args){
        System.out.println(canBuildGoalLength(3,1,8));
        System.out.println(canBuildGoalLength(3,1,9));
        System.out.println(canBuildGoalLength(3,2,10));
    }
}
