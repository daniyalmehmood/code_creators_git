public class DifferenceGreaterThanTenChecker {
    public static void main(String[] args) {
        System.out.println(isLessByTen(1, 7, 11));// → true
        System.out.println(isLessByTen(1, 7, 10));// → false
        System.out.println(isLessByTen(11, 1, 7));// → true
    }
    public static boolean isLessByTen(int a, int b, int c) {
        if(Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10){
            return true;
        }
        return false;
    }
}
