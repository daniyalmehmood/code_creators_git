public class NearMultipleChecker {
    //method checks if a number is 2 or 1 less than a multiple of 20
    public static boolean isJustBeforeTwenty(int n) {
        int remainder = n % 20;
        return (remainder == 18 || remainder == 19);
    }
}
