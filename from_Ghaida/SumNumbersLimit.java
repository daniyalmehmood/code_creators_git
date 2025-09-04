public class SumNumbersLimit {
    public static void main(String[] args) {
        System.out.println(calculateSumWithLimit(2, 3));// → 5
        System.out.println(calculateSumWithLimit(8, 3));// → 8
        System.out.println(calculateSumWithLimit(8, 1));// → 9
    }
    public static int calculateSumWithLimit(int a, int b) {
        int sum = a + b;
        String aAsString = String.valueOf(a);
        String sumAsString = String.valueOf(sum);
        if(sumAsString.length() > aAsString.length()){
            return a;
        }
        return sum;
    }
}