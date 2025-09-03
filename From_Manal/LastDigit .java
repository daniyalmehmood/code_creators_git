public class LastDigit {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        int LastA = a % 10;
        int LastB = b % 10;
        int LastC = c % 10;
        return  (LastA == LastB || LastA == LastC || LastB == LastC);
    }
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 19, 13));
        System.out.println(hasSameLastDigit(23, 19, 12));
        System.out.println(hasSameLastDigit(23, 19, 3));
    }
    }
