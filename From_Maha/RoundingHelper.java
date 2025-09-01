public class RoundingHelper {
    public boolean isNearMultipleOfTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 9 || num % 10 == 8;

    }
}
