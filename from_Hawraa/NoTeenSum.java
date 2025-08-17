public class NoTeenSum {
    public static int sumWithoutTeens(int a, int b, int c) {
        return fixTeenValue(a) + fixTeenValue(b) + fixTeenValue(c);
    }

    public static int fixTeenValue(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(sumWithoutTeens(1, 2, 3));
        System.out.println(sumWithoutTeens(2, 13, 1));
        System.out.println(sumWithoutTeens(2, 1, 14));
    }
}
