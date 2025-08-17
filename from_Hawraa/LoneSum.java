public class LoneSum {
    public static int sumUniqueValue(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUniqueValue(1, 2, 3));
        System.out.println(sumUniqueValue(3, 2, 3));
        System.out.println(sumUniqueValue(3, 3, 3));
    }
}
