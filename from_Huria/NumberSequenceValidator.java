public class NumberSequenceValidator {
    public static boolean numberSequenceValidator(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if ((a == b && a == c && b == c) || (a == b && b < c) || (b == c && a < b)) return true;
        } else {
            if (a < b && b < c) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(numberSequenceValidator(2, 5, 11, false));
        System.out.println(numberSequenceValidator(5, 7, 6, false));
        System.out.println(numberSequenceValidator(5, 5, 7, true));
    }
}
