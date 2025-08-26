public class SkipOnThirteen {
    public static void main(String[] args) {
        System.out.println(calculateLuckySum(1, 2, 3));// → 6
        System.out.println(calculateLuckySum(1, 2, 13));// → 3
        System.out.println(calculateLuckySum(1, 13, 3));// → 1
    }
    public static int calculateLuckySum(int a, int b, int c) {
        int sum = a + b + c;
        if(a == 13){
            return 0;
        }
        else if (b == 13) {
            return a;
        }
        else if (c == 13) {
            return a + b;
        }
        return sum;
    }
}
