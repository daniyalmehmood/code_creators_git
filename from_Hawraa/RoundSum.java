public class RoundSum {
    public static int roundAndSum(int a, int b, int c) {
        return nearestTen(a) + nearestTen(b) + nearestTen(c);
    }

    public static int nearestTen(int num) {
        int reminder = num % 10;
        if (reminder >= 5) {
            return num + (10 - reminder);
        }
        return num - reminder;
    }

    public static void main(String[] args){
        System.out.println(roundAndSum(16, 17, 18));
        System.out.println(roundAndSum(12, 13, 14));
        System.out.println(roundAndSum(6, 4, 4));
    }
}
