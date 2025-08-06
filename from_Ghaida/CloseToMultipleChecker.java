public class CloseToMultipleChecker {
    public static void main(String[] args) {
        System.out.println(isCloseToMultipleOfTen(12));// → true
        System.out.println(isCloseToMultipleOfTen(17));// → false
        System.out.println(isCloseToMultipleOfTen(19));// → true
    }
    public static boolean isCloseToMultipleOfTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }
}