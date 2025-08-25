public class SumChecker {
    public static boolean canTwoNumbersSumToThird(int a, int b, int c) {
        if (a+b==c || a+c==b||b+c==a) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canTwoNumbersSumToThird(1,2,3));
    }
}
