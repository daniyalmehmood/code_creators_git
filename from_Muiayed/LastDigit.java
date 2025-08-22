public class LastDigit {

    public static boolean lastDigit(int a, int b, int c) {
        int da = a % 10;
        int db = b % 10;
        int dc = c % 10;
        return da == db || da == dc || db == dc;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13)); // true
        System.out.println(lastDigit(23, 19, 12)); // false
        System.out.println(lastDigit(23, 19, 3));  // true
    }
}