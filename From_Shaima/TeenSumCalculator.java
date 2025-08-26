public class TeenSumCalculator {
    public static int sumIgnoringTeens(int a, int b, int c) {
        return fixTeenValue(a) + fixTeenValue(b) + fixTeenValue(c); // return the sum of the number after fix it
    }
    public  static int fixTeenValue(int n) {
        if ((n >= 13 && n <= 19 ) && n!=15 && n!=16) return 0; // return 0 if the value is in the 13-19 range except 15 and 16
        return n; // otherwise return the number
    }
    public static void main(String[] args) {
        System.out.println(sumIgnoringTeens(2, 4, 6));
    }
}
