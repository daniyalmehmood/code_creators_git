public class SevenDigitCounter {//Recursion-1 > count7
    public static void main(String[] args) {
        System.out.println(countSevenDigits(717));// → 2
        System.out.println(countSevenDigits(7));// → 1
        System.out.println(countSevenDigits(123));// → 0
    }
    public static int countSevenDigits(int n) {
        int right = n % 10; //get the last digit
        int left = n / 10;  //remove the last digit
        if(n == 0){
            return 0;
        }
        if(right == 7) {
            return 1 + countSevenDigits(left);
        }
        return countSevenDigits(left);
    }   
}