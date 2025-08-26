public class CanTwoNumbersSumToThird {
    public static boolean canTwoNumbersSumToThird(int a, int b, int c) {
        if (a+b==c || a+c==b || b+c==a) return true;
        else return false;
    }
    public static void main(String[] args) {

        System.out.println(canTwoNumbersSumToThird(1, 2, 3));
        System.out.println(canTwoNumbersSumToThird(3, 1, 2));
        System.out.println(canTwoNumbersSumToThird(3, 2, 2));
    }
}
