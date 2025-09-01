public class DigitSummer {
    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i <str.length(); i++) {
            char character = str.charAt(i);

            if (Character.isDigit(character)) {
                // Convert the digit character to an actual number
                int num = Character.getNumericValue(character);
                sum += num;
            }
        }
        return sum;
    }

}
