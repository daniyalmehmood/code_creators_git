//AP-1 > hasOne
public class HasOne {
    public boolean numberContainsOne(int n) {
        for (int i = 0; n > 0; i++) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

}