public class DigitChecker  {

    public boolean hasSameLastDigit(int a, int b) {
        if (a%10 == b%10) return true;
        return false;
    }
}
