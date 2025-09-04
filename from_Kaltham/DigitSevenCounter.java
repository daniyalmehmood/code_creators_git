//Recursion-1 > count7

public class DigitSevenCounter {
    public int countSevens(int n) {
        if (n > 0) {
            if (n % 10 == 7) {
                return 1 + countSevens(n / 10);
            } else {
                return countSevens(n / 10);
            }
        }
        return 0;
    }
}