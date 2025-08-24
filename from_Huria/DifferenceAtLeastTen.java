public class DifferenceAtLeastTen {
    public static boolean isDifferenceAtLeastTen(int a, int b, int c) {
        if (a <= b - 10 || a <= c - 10 || b <= a - 10 || b <= c - 10 || c <= a - 10 || c <= b - 10) return true;
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(isDifferenceAtLeastTen(1, 7, 11));
        System.out.println(isDifferenceAtLeastTen(1, 7, 10));
        System.out.println(isDifferenceAtLeastTen(11, 1, 7));
    }
}