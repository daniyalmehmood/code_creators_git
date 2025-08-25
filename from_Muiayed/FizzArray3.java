public class FizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        int len = end - start;
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = start + i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzArray3(5, 10)));
        System.out.println(java.util.Arrays.toString(fizzArray3(11, 18)));
        System.out.println(java.util.Arrays.toString(fizzArray3(1, 3)));
    }
}