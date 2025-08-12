public class InOrderEqual {
    public static boolean isInOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a <= b && b <=c;
        return a < b && b < c;
    }
    public static void main(String[] args) {
        System.out.println(isInOrderEqual(2, 5, 11, false));
        System.out.println(isInOrderEqual(5, 7, 6, false));
        System.out.println(isInOrderEqual(5, 5, 7, true) );
    }

}
