public class ConditionalSum {
    public static int calculateSpecialSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculateSpecialSum(3, 4));  // 7
        System.out.println(calculateSpecialSum(10, 11)); // 21
        System.out.println(calculateSpecialSum(9, 4));  // 20
    }
}