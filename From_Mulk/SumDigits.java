public class SumDigits {
    public int sumOfDigitsInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            if (character.matches("[0-9]")) {
                int number = Integer.parseInt(character);
                if (number >= 0 && number <= 9) {
                    sum += number;
                }

            }
        }
        return sum;

    }
}
