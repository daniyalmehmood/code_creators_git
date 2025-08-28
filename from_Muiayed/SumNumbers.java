public class SumNumbers {

    /*  CodingBat method  */
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    sum += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }

        if (num.length() > 0) {
            sum += Integer.parseInt(num.toString());
        }

        return sum;
    }
    public static void main(String[] args) {
        SumNumbers sn = new SumNumbers();
        System.out.println(sn.sumNumbers("abc123xyz"));
        System.out.println(sn.sumNumbers("aa11b33"));
        System.out.println(sn.sumNumbers("7 11"));
        System.out.println(sn.sumNumbers("Chocolate"));
        System.out.println(sn.sumNumbers("5h3ll02"));
    }
}