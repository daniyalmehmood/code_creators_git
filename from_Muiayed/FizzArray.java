public class FizzArray {
    public static int[] fizzArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    public static void main(String[] args) {
        java.util.Arrays.stream(fizzArray(4)).forEach(System.out::print);
        System.out.println();
        java.util.Arrays.stream(fizzArray(1)).forEach(System.out::print);
        System.out.println();
        java.util.Arrays.stream(fizzArray(10)).forEach(System.out::print);
    }
}