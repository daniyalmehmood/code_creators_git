public class OldThirtyFive {
    public static boolean isThreeOrFive(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return true;
        } else if (n % 3 != 0 && n % 5 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isThreeOrFive(3));
        System.out.println(isThreeOrFive(10));
        System.out.println(isThreeOrFive(15));
    }
}
