public class MakeBricks {
    public static boolean canBuildGoal(int small, int big, int goal) {
        int maxBig = goal / 5;
        int usedBig = Math.min(maxBig, big);
        int r = goal - (usedBig * 5);
        return small >= r;
    }

    public static void main(String[] args) {
        System.out.println(canBuildGoal(3, 1, 8));
        System.out.println(canBuildGoal(3, 1, 9));
        System.out.println(canBuildGoal(3, 2, 10));
    }
}
