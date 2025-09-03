public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        int aTens = a / 10, aOnes = a % 10;
        int bTens = b / 10, bOnes = b % 10;
        return aTens == bTens || aTens == bOnes || aOnes == bTens || aOnes == bOnes;
    }
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23)); // true
        System.out.println(shareDigit(12, 43)); // false
        System.out.println(shareDigit(12, 44)); // false
    }
}