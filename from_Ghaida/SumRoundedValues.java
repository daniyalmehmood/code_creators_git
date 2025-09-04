public class SumRoundedValues {
    public static void main(String[] args) {
        System.out.println(totalRounded(16, 17, 18));// → 60
        System.out.println(totalRounded(12, 13, 14));// → 30
        System.out.println(totalRounded(6, 4, 4));// → 10
    }
    public static int totalRounded(int a, int b, int c) {
        return roundToTen(a) + roundToTen(b) + roundToTen(c);
    }
    public static int roundToTen(int number) {
        if (number % 10 >= 5) {
            return number + (10 - number % 10); //round up
        }
        return number - (number % 10);      //round down
    }
}
