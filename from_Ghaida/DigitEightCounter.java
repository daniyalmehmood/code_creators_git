public class DigitEightCounter {//Recursion-1 > count8
    public static void main(String[] args) {
        System.out.println(countEightDigits(8));// → 1
        System.out.println(countEightDigits(818));// → 2
        System.out.println(countEightDigits(8818));// → 4
    }
    public static int countEightDigits(int n) {
        int rightDigit = n % 10; //get the last digit
        int leftDigit = n / 10;  //remove the last digit
        int count8 = 0;
        if(n == 0){
            return 0;
        }
        if (rightDigit == 8) {
            count8++;
            if ((leftDigit) % 10 == 8) {
                count8++;
            }
        }

        return count8 + countEightDigits(leftDigit);
    }

}