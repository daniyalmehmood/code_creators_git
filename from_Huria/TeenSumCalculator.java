public class TeenSumCalculator {
    public static int teenSumCalculator(int a, int b) {
        int sum=a+b;
        if((13<=a && a<=19) ||(13<=b && b<=19)){
            return 19;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(teenSumCalculator(3, 4));
        System.out.println(teenSumCalculator(10, 13));
        System.out.println(teenSumCalculator(13, 2));
    }
}
