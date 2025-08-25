public class NumberSummer {
    // Method to sum all numbers found in a string
    public static int sumNumbersInString(String text) {
        int sum = 0;
        String currentNumber = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber += currentChar; 
            } else {
                if (!currentNumber.isEmpty()) {
                    sum += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }
        }
        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbersInString("abc123xyz"));
        System.out.println(sumNumbersInString("aa11b33"));
        System.out.println(sumNumbersInString("7 11"));
        System.out.println(sumNumbersInString("5 apples 10 bananas 2"));
    }
}