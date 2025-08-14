public class InTheirtyFifty  {

    public boolean areBothInSameRange30to40or40to50(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }
}
