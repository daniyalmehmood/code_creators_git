//Logic-2 > roundSum


public class RoundSumCalculator {
    public int calculateRoundedSum(int a, int b, int c) {
        return roundToNearestTen(a) + roundToNearestTen(b) + roundToNearestTen(c);
    }

    public int roundToNearestTen(int num) { 
        if (num % 10 >= 5) {
            int reminder = num % 10;
            reminder = 10 - reminder;
            num = num + reminder;

        } else {
            int reminder = num % 10;
            num = num - reminder;
        }

        return num;
    }
}