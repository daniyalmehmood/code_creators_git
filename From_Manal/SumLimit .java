public class SumLimit {
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        if (Integer.toString(sum).length() > Integer.toString(a).length()) return a;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));   // 5
        System.out.println(sumLimit(8, 3));   // 8 
        System.out.println(sumLimit(11, 3));  // 14
    }
}