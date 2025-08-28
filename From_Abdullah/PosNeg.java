public class PosNeg {
    public boolean checkPosNegCondition(int a, int b, boolean negative) {

        if (!negative) {
            return (a < 0 && b > 0 || a > 0 && b < 0) ;

        } if (negative) {
            return ( a < 0 && b < 0);
        }
        return false;
    }
}
