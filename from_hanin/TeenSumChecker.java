public class TeenSumChecker {
    public static int calculateTeenSum(int a, int b) {
        //values in the range 13..19 inclusive, return 19.
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }
}

