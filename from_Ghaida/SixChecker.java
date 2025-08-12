public class SixChecker {
    public static void main(String[] args) {
        System.out.println(hasSixMatch(6, 4));// → true
        System.out.println(hasSixMatch(4, 5));// → false
        System.out.println(hasSixMatch(1, 5));// → true
    }
    public static boolean hasSixMatch(int a, int b) {
        int sumOFAAndB = a + b;
        int diffAAndB = Math.abs(a- b);
        if(a == 6 || b == 6 || sumOFAAndB == 6 || diffAAndB== 6){
            return true;
        }
        return false;
    }
}
