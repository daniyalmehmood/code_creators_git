public class EvenlySpaced {
    public static boolean areEvenlySpaced(int a, int b, int c) {
        int large = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));
        int medium = a + b + c - large - small;
        return (medium - small) == (large - medium);
    }

    public static void main(String[] args) {
        System.out.println(areEvenlySpaced(2, 4, 6));
        System.out.println(areEvenlySpaced(4, 6, 2));
        System.out.println(areEvenlySpaced(4, 6, 3));
    }
}
