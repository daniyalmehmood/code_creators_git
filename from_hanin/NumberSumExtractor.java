public class NumberSumExtractor {
    public int extractAndSumNumbers(String str) {
        int sum = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    result += str.charAt(i);

                } else {
                    result += str.charAt(i);
                    sum += Integer.parseInt(result);
                    result = "";
                }

            }
        }

        return sum;
    }
}
