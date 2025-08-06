public class AdjustedSumCalculator {
    public static void main(String[] args) {
        System.out.println(calculateAdjustedSum(3, 4));// → 7
        System.out.println(calculateAdjustedSum(9, 4));// → 20
        System.out.println(calculateAdjustedSum(10, 11));// → 21
    }
    public static int calculateAdjustedSum(int a, int b) {
        int sumOfAAndB = a + b;
        if(sumOfAAndB >=10 && sumOfAAndB <= 19){
            return 20;
        }
        return sumOfAAndB;
    }
}
