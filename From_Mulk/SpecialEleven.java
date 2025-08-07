public class SpecialEleven {
    public boolean checkMultipleOfEleven(int n) {
        if ((n % 11 == 0) || (n % 11 == 1)) {
            return true;
        }
        return false;
    }
}
