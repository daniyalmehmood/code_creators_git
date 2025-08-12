public class NearMultipleOfTen {
    public static boolean isWithinTwoOfMultipleOfTen(int number) {
        int remainder = number % 10;
        //return true if num is within 2 of a multiple of 10.
        return (remainder <= 2 || remainder >= 8);
    }
}


