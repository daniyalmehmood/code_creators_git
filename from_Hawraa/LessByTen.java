public class LessByTen {
    public static boolean hasDifferenceOfTenOrMore(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10;
    }

    public static void main(String[] args){
        System.out.println(hasDifferenceOfTenOrMore(1, 7, 11));
        System.out.println(hasDifferenceOfTenOrMore(1, 7, 10));
        System.out.println(hasDifferenceOfTenOrMore(11, 1, 7));
    }
}
