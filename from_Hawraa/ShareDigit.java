public class ShareDigit {
    public static boolean hasCommonDigit(int a, int b) {
        return a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || a % 10 == b / 10;
    }

    public static void main(String[] args) {
        System.out.println(hasCommonDigit(12, 23));
        System.out.println(hasCommonDigit(12, 43));
        System.out.println(hasCommonDigit(12, 44));
    }
}
