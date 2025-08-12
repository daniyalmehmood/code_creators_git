public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigitsInString("aa1bc2d3"));// → 6
        System.out.println(sumDigitsInString("aa11b33"));// → 8
        System.out.println(sumDigitsInString("Chocolate"));// → 0
    }
    public static int sumDigitsInString(String str) {
        int sumOfDigit = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(Character.isDigit(currentChar)){
                sumOfDigit += Character.getNumericValue(currentChar);
            }
        }
        return sumOfDigit;
    }
}