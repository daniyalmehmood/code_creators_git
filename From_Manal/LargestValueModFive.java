public class LargestValueModFive {
    public static int getLargestValueModFive(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a,b);
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        System.out.println(getLargestValueModFive(2, 3));
        System.out.println(getLargestValueModFive(6, 2));
        System.out.println(getLargestValueModFive(3, 2));
    }
}