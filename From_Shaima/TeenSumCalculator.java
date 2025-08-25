public class TeenSumCalculator {
    public static int teenSumCalculator(int a, int b) {
        if ((a>=13 && a<=19) ||(b>=13 && b<=19)){
            return 19;
        }
        return a+b;
    }
    public  static void main(String[] args) {
        System.out.println(teenSumCalculator(3,4));
    }
}
