public class Makes10 {
    public boolean isTenOrSumTen(int a, int b) {
        if ((a==10||b==10) || (a+b==10)) {
            return true;
        }
        return false;
    }
}
