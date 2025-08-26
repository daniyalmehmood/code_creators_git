public class SpecialElevenChecker {
    public static boolean specialElevenChecker(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(specialElevenChecker(22));
        System.out.println(specialElevenChecker(23));
        System.out.println(specialElevenChecker(24));
    }
}