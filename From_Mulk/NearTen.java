public class NearTen {
    public boolean nearMultipleOfTen(int num) {
        if (num % 10 <= 2 || num % 10 == 8 || num % 10 == 9) {
            return true;
        }
        return false;
    }
}