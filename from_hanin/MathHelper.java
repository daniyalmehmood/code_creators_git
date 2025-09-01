public class MathHelper {
    public boolean isNearMultipleOf20(int n) {
        int remainder = n % 20;
        if (remainder == 1 || remainder == 2) {
            return true;
        } else {
            return false;
        }
    }

}
