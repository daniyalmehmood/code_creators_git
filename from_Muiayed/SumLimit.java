public class SumLimit {

    public static int sumLimit(int a, int b) {
        int sum = a + b;
        return String.valueOf(sum).length() == String.valueOf(a).length() ? sum : a;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3)); // 5
        System.out.println(sumLimit(8, 3)); // 8
        System.out.println(sumLimit(8, 1)); // 9
    }
}