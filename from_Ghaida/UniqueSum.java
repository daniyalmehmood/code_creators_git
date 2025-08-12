public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(calculateUniqueSum(1, 2, 3));// → 6
        System.out.println(calculateUniqueSum(3, 2, 3));// → 2
        System.out.println(calculateUniqueSum(3, 3, 3));// → 0
    }
    public static int calculateUniqueSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && a == c) {
            return 0;
        }else if(a == b){
            return c;
        } else if (a == c) {
            return b;
        } else if (c == b) {
            return a;
        }
        return sum;
    }
}
