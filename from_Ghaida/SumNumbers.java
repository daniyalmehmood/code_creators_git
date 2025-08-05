public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbersInString("abc123xyz"));// → 123
        System.out.println(sumNumbersInString("aa11b33")); // → 44
        System.out.println(sumNumbersInString("7 11")); // → 18
    }
    public static int sumNumbersInString(String str) {
        StringBuilder currentNumber = new StringBuilder();
        int sumOfDigit = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNumber.append(currentChar);
            }
            else {
                if (currentNumber.length() > 0) {
                    sumOfDigit += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0); // Reset for the next number
                }
            }
        }
        if (currentNumber.length() > 0) {
            sumOfDigit += Integer.parseInt(currentNumber.toString());
        }
        return sumOfDigit;
    }
}
