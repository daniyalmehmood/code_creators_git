public class SumDigits {
    public static int sumDigitsInStr(String str) {
        int sumDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sumDigits += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sumDigits;
    }

    public static void main(String[] args) {
        System.out.println(sumDigitsInStr("aa1bc2d3"));
        System.out.println(sumDigitsInStr("aa11b33"));
        System.out.println(sumDigitsInStr("Chocolate"));
    }
}
