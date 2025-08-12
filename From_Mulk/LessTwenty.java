public class LessTwenty {
    public boolean LessThanMultipleOfTwenty(int n) {
        if (((n + 1) % 20 == 0) || ((n + 2) % 20 == 0)) {
            return true;
        }
        return false;
    }
}
