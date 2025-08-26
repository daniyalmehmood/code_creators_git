public class RoundedSumCalculator {
    public static int sumRoundedToTen(int a, int b, int c) {
        return roundToNearestTen(a)+ roundToNearestTen(b)+ roundToNearestTen(c);// sum the value after rounded to multiple of 10
    }
    public static int roundToNearestTen(int num) {
        int reminder = num%10; // calculate the reminder while divided by 10
        if (reminder >=5){ // reminder is greater than or equal 5
            return num + (10 - reminder); // then the number will round up to next multiple of 10
        }
        return num - reminder; // otherwise will be round down to a multiple of 10
    }
    public static void main(String[] args) {
        System.out.println(sumRoundedToTen(16, 17, 18));
    }
}
