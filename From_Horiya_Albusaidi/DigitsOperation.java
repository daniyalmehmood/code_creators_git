public class DigitsOperation {
    public int sumDigits(String str) {
        int sumOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sumOfDigits += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sumOfDigits;
    }

}
