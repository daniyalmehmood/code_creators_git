public class NumberSummer {
    public static int sumNumbersInString(String str) {
        int sum = 0;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0); // reset number builder
                }
            }
        }
        if (number.length() > 0) {
            sum += Integer.parseInt(number.toString());
        }

        return sum;
    }
public static void main(String arg[]){
    System.out.println(sumNumbersInString("abc123xyz"));
    System.out.println(sumNumbersInString("aa11b33"));
    System.out.println(sumNumbersInString("7 11"));
}
}
