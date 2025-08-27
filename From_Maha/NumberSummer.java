//String-3 > sumNumbers
public class NumberSummer {
    public int sumAllNumbersInString(String str) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                sum += num;
                num = 0;
            }
        }
        sum += num; // add last number if string ends with digits
        return sum;
    }
}
