public class CheckHappyLetter {
    public static boolean checkIfLetterGHappyOrNot(String str) {
        if (str.isEmpty()) return true;
        boolean result = false;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i + 1 < str.length()) {
                    result = str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g';

                } else {
                    result = str.charAt(i - 1) == 'g';
                }
            }
        }
        return result;
    }

}
