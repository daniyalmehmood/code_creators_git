// String-3 > sumNumbers
public class SumNumbers {
    public static int sumNumbersInString(String str) {
        int sumDigits = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // check if the Character is a digit
                num += str.charAt(i);
            } else { // if num has a numbers convert it to int and add to sum
                if (!num.isEmpty()) {
                    sumDigits += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) { // check if a number is left at the end
            sumDigits += Integer.parseInt(num);
        }
        return sumDigits;
    }

    public static void main(String[] args){
        System.out.println(sumNumbersInString("abc123xyz"));
        System.out.println(sumNumbersInString("aa11b33"));
        System.out.println(sumNumbersInString("7 11"));
    }
}
