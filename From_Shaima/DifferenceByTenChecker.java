public class DifferenceByTenChecker {
    public static boolean isDifferenceAtLeastTen(int a, int b, int c) {
        return Math.abs(a-b)>=10|| Math.abs (a-c) >=10 || Math.abs(b-c)>=10;
    }
    public static void main(String[] args) {
        System.out.println(isDifferenceAtLeastTen(1,7,11));
    }
}
