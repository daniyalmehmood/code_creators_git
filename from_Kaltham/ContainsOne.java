//AP-1 > hasOne

public class ContainsOne {
    public boolean hasContainsOne(int n) {
        while (n > 0) {
            if (n % 10 != 1) {
                n = n / 10;
            } else {
                return true;
            }
        }
        return false;
    }
}