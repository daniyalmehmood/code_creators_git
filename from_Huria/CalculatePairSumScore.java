public class CalculatePairSumScore {
    public static int calculatePairSumScore(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if ((ab == 10 + bc) || (ab == 10 + ac) || (bc == 10 + ab) || (bc == 10 + ac) || (ac == 10 + ab) || (ac == 10 + bc)) {
            return 5;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(calculatePairSumScore(9, 1, 0));
        System.out.println(calculatePairSumScore(9, 2, 0));
        System.out.println(calculatePairSumScore(6, 1, 4));
    }
}
