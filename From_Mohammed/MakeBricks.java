public class MakeBricks {
    public boolean canBuildGoalLength(int small, int big, int goal) {
        if (goal > small + big * 5) return false;
        if (goal % 5 > small) return false;
        return true;
    }
}
