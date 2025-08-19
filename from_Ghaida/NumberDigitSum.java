public class NumberDigitSum {//Recursion-1 > sumDigits
    public static void main(String[] args) {
        System.out.println(calculateDigitSum(126));// → 9
        System.out.println(calculateDigitSum(49));// → 13
        System.out.println(calculateDigitSum(12));// → 3
    }
    public static int calculateDigitSum(int n) {
        int right = n % 10;
        int left = n / 10;
        if(left == 0){
            return right;
        }
        return calculateDigitSum(left) + right;
    }
}