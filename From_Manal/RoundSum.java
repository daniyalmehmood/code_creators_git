public class RoundSum {

    // sum of rounded values
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    // rounds num to nearest multiple of 10
    public int round10(int num) {
        int remainder = num % 10;
        if (remainder >= 5) {
            return num + (10 - remainder);  // round up
        } else {
            return num - remainder;         // round down
        }
    }


    public static void main(String[] args) {
        RoundSum rs = new RoundSum();
        System.out.println(rs.roundSum(16, 17, 18)); // 60 (20 + 20 + 20)
        System.out.println(rs.roundSum(12, 13, 14)); // 30 (10 + 10 + 10)
        System.out.println(rs.roundSum(6, 4, 4));    // 10 (10 + 0 + 0)
    }
}