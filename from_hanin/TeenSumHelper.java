public class TeenSumHelper {
    public int sumIgnoringTeens(int a, int b, int c) {
        if ((a >= 13 && a <= 19 && a != 15 && a != 16) && (b >= 13 && b <= 19 && b != 15 && b != 16) && (c >= 13 && c <= 19 && c != 15 && c != 16)) {
            return 0;
        }
//if any of the value range 13..19 inclusive then that value counts as 0
        if (a >= 13 && a <= 19 && a != 15 && a != 16) {
            a = 0;
        }
        if (b >= 13 && b <= 19 && b != 15 && b != 16) {
            b = 0;
        }
        if (c >= 13 && c <= 19 && c != 15 && c != 16) {
            c = 0;
        }

        return a + b + c;
    }

}