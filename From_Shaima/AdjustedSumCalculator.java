public class AdjustedSumCalculator {
    public static int getAdjustedSum(int a, int b) {
        int sum=a+b; // initialize 'sum' variable and assign to be the sum of 'a' and 'b'
        if (10<=sum && sum<=19) return 20;// if the sum is between 10 and 19 the result is 20;
        return sum; //otherwise the result is 'sum'
    }
    public static void main(String[] args) {
        System.out.println(getAdjustedSum(3,4));
    }
}
