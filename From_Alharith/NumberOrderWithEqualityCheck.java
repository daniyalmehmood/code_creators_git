public class NumberOrderWithEqualityCheck  {

    public boolean isInIncreasingOrderWithOptionalEquality(int a, int b, int c, boolean equalOk) {

        if (equalOk && ((a<=b) && (b<=c))) return true;
        if ((a<b) && (b<c)) return true;
        return false;
    }

}
