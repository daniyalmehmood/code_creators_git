public class LessByTen {
    public boolean hasLargeDifference(int a, int b, int c) {
        if (a <= b - 10 || b <= c - 10 || c <= a - 10 || b <= a - 10 || c <= b - 10 || a <= c - 10) {
            return true;
        }
        return false;

    }
}