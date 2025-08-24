public class PosNeg {
    public static boolean posNegs(int a, int b, boolean negative) {
        if (a >= 0 && b < 0 && !negative) return true;
        else if (a < 0 && b >= 0 && !negative) return true;
        else if (a < 0 && b < 0 && negative) return true;
        else return false;
    }
}
