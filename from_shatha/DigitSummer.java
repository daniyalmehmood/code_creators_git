public class DigitSummer {
    public static int sumDigitsInString(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }
public static void main(String arg[]){
    System.out.println(sumDigitsInString("aa1bc2d3"));
    System.out.println(sumDigitsInString("aa11b33"));
    System.out.println(sumDigitsInString("Chocolate"));
}
}
