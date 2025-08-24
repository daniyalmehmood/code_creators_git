public class SumNumbers {
    public int sumWholeNumbersInString(String str) {
        int sum = 0;
        String numberString = "";

        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);

            if (character.matches("[0-9]")) {
                numberString += character;
            } else {
                if (!numberString.equals("")) {
                    sum += Integer.parseInt(numberString);
                    numberString = "";
                }
            }
        }

        if (!numberString.equals("")) {
            sum += Integer.parseInt(numberString);
        }

        return sum;
    }
}
