public class LastDigit {
    public boolean anyTwoHaveSameLastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10) {
            return true;
        }
        return false;
    }
}
