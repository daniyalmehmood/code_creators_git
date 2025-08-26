//String-3 > gHappy
public class StringValidation {
   // Ensures every 'g' in the string has a neighboring 'g'.
    public boolean areAllGsHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftCheck = i > 0 && str.charAt(i - 1) == 'g';
                boolean rightCheck = i + 1 < str.length() && str.charAt(i + 1) == 'g';
                if (!leftCheck && !rightCheck) {
                    return false;
                }
            }
        }
        return true;
    }
}
