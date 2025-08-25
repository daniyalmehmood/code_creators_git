public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = String.valueOf(i);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzArray2(4)));
        System.out.println(java.util.Arrays.toString(fizzArray2(10)));
        System.out.println(java.util.Arrays.toString(fizzArray2(2)));
    }
}