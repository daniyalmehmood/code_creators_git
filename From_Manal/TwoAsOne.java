public class TwoAsOne {
    public static boolean checkTwoAsOne(int a, int b, int c) {
        return (a + b == c) || (b + c == a) || (c + a == b);
    }
    public static void main(String[] args) {
        System.out.println(checkTwoAsOne(1, 2, 3));
        System.out.println(checkTwoAsOne(3, 1, 2));
        System.out.println(checkTwoAsOne(3, 2, 2) );
    }
    }
