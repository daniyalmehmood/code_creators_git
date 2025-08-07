public class TeenRangeSumCalculator  {

    public int calculateSumConsideringTeenRange(int a, int b) {
        int sum=a+b;
        if ((a>=13 && a<=19) || (b>=13 && b<=19)) return 19 ;
        return sum;
    }

}
