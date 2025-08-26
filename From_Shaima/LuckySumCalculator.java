public class LuckySumCalculator{
    public static int luckySumExcludingThirteen(int a, int b, int c) {
        if (a==13) return 0; // b && c not equal to 13
        if (b==13) return a ; // only b is 13
        if (c==13)return a+b; // only c is 13
        return a+b+c; // no 13 in the input
    }
    public static void main(String[] args) {
        System.out.println(luckySumExcludingThirteen(1, 2, 3));
    }
}
